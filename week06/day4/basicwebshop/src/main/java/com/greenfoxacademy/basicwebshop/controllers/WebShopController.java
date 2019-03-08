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
import java.util.stream.Collectors;

@Controller
public class WebShopController {

    private List<ShopItem> shopItemList = new ArrayList<>();
    // ShopItemList itemList;

    public WebShopController() {
        shopItemList.add(new ShopItem("Apple", "delicious fruit, price/kg", 200.0, 5));
        shopItemList.add(new ShopItem("Pear", "delicious fruit, price/kg", 250.0, 123));
        shopItemList.add(new ShopItem("Carrot", "vegetable, price/kg", 180.0, 7));
        shopItemList.add(new ShopItem("Broccoli", "vegetable, price/piece", 300.0, 4));
        shopItemList.add(new ShopItem("Human kidney", "human organ", 2000000.0, 2));
    }

   /* public WebShopController() {
        List<ShopItem> list = new ArrayList<>();
        itemList = new ShopItemList(list);
        initializeList();
    } */

    @RequestMapping("/webshop")
    public String getWebshop(Model model) {
        model.addAttribute("shopItems", shopItemList);
        return "webshop";
    }

    @RequestMapping("/only-available")
    public String getOnlyAvailable(Model model){
        List<ShopItem> availableOnly = shopItemList.stream()
                .filter(i -> i.getQuantity() > 0)
                .collect(Collectors.toList());
        model.addAttribute("shopItems", availableOnly);
        return "webshop";
    }



}
