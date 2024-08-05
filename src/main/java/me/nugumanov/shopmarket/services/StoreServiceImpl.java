package me.nugumanov.shopmarket.services;

import me.nugumanov.shopmarket.models.Basket;
import me.nugumanov.shopmarket.models.Item;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class StoreServiceImpl implements StoreService {

    private final Basket basket;

    public StoreServiceImpl(Basket basket) {
        this.basket = basket;
    }

    Map<Integer, Item> itemsMap = new HashMap<>(Map.of(
            1, new Item(1, "Bread"),
            2, new Item(2, "Cheese"),
            3, new Item(3, "Milk")));


    @Override
    public void add(List<Integer> itemIds) {
        basket.addAll(itemIds.stream()
                .map(itemsMap::get)
                .collect(Collectors.toList()));
    }

    @Override
    public List<Item> get() {
        return basket.getAll();
    }
}
