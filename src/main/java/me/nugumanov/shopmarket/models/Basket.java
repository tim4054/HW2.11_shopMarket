package me.nugumanov.shopmarket.models;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;

@Component
@SessionScope
public class Basket {
    private final List<Item> basket = new ArrayList<>();

    public void addAll(List<Item> items) {
        basket.addAll(items);
    }

    public List<Item> getAll() {
        return Collections.unmodifiableList(basket);
    }
























    /*List<Item> itemList;
    Map<Integer, Item> items = new HashMap<>(Map.of(
            1, new Item( "Молоко", 100),
            2, new Item( "Хлеб", 50),
            3, new Item( "Яйца", 999)));

    public Basket(List<Item> itemList) {
        this.itemList = itemList;
    }

    public Item toAdd(int ID) {
        Item item = items.get(ID);
        itemList.add(item);
        return item;
    }*/
}
