package com.greenfoxacademy.basicwebshop.controllers;

import com.greenfoxacademy.basicwebshop.model.ShopItem;
import com.greenfoxacademy.basicwebshop.model.ShopItemList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Comparator;
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
        shopItemList.add(new ShopItem("Human kidney", "human organ", 2000000.0, 0));
        shopItemList.add(new ShopItem("Nike shoes", "nike", 2000000.0, 0));
    }

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

    @RequestMapping("/cheapest-first")
    public String getCheapestFirst(Model model){
        List<ShopItem> cheapestFirstList = shopItemList.stream()
                .sorted(Comparator.comparing(ShopItem::getPrice))
                .collect(Collectors.toList());
        model.addAttribute("shopItems", cheapestFirstList);
        return "webshop";
    }

    @RequestMapping("/contains-nike")
    public String getItemContainingNike(Model model){
        List<ShopItem> itemContainingNike = shopItemList.stream()
                .filter(i -> i.getName().toLowerCase().contains("nike") || i.getDescription().toLowerCase().contains("nike"))
                .collect(Collectors.toList());
        model.addAttribute("shopItems", itemContainingNike);
        return "webshop";
    }

    @RequestMapping("/most-expensive-available")
    public String getMostExpensive(Model model){
        ShopItem mostExpensive = shopItemList.stream()
                .filter(i -> i.getQuantity() > 0)
                .max(Comparator.comparing(ShopItem::getPrice))
                .get();
        model.addAttribute("shopItems", mostExpensive);
        return "webshop";
    }

    @RequestMapping("/avg-stock")
    public String getAverageStock(Model model){
        double averageOfStock = shopItemList.stream()
                .filter(i -> i.getQuantity() > 0)
                .mapToInt(ShopItem::getQuantity)
                .summaryStatistics().getAverage();
        model.addAttribute("singleItem", averageOfStock);
        return "single_item";
    }

    @PostMapping("/search")
    public String search(Model model, @RequestParam("keyword") String keyword) {

        List<ShopItem> matchingItemsList = shopItemList.stream()
                .filter(i -> i.getName().toLowerCase().contains(keyword.toLowerCase()) ||
                        i.getDescription().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
        model.addAttribute("shopItems", matchingItemsList);

        return "webshop";
    }





}
