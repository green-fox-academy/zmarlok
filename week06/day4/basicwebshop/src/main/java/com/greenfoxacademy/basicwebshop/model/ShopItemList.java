package com.greenfoxacademy.basicwebshop.model;

import java.util.List;

public class ShopItemList {

    private List<ShopItem> shopItemList;

    public List<ShopItem> getShopItemList() {
        return shopItemList;
    }

    public ShopItemList(List<ShopItem> shopItemList) {
        this.shopItemList = shopItemList;
    }

    public void addToShopItemList (ShopItem item){
        shopItemList.add(item);
    }
}
