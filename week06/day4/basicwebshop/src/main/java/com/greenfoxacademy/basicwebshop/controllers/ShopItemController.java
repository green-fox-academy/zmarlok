package com.greenfoxacademy.basicwebshop.controllers;

import com.greenfoxacademy.basicwebshop.model.ShopItem;
import com.greenfoxacademy.basicwebshop.model.ShopItemList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class ShopItemController {

    ShopItemList itemList;

    public void initializeList() {
        itemList.addToShopItemList(new ShopItem("Apple", "delicious fruit, price/kg", 200.0, 5));
        itemList.addToShopItemList(new ShopItem("Pear", "delicious fruit, price/kg", 250.0, 123));
        itemList.addToShopItemList(new ShopItem("Carrot", "vegetable, price/kg", 180.0, 7));
        itemList.addToShopItemList(new ShopItem("Broccoli", "vegetable, price/piece", 300.0, 4));
        itemList.addToShopItemList(new ShopItem("Human kidney", "human organ", 2000000.0, 2));
    }

    public ShopItemController() {
        List<ShopItem> list = new ArrayList<>();
        itemList = new ShopItemList(list);
        initializeList();
    }

    @RequestMapping("/web/webshop")
    public String webshop(Model model) {
        model.addAttribute("items", itemList.getShopItemList());
        return "webshop";
    }


/* Create a data structure for storing the ShopItems
    Have a predefined list of items in your controller
    you can initialize the list and add some shop items in the constructor of the controller */
}
