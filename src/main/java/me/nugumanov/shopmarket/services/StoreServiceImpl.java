package me.nugumanov.shopmarket.services;

import me.nugumanov.shopmarket.models.Basket;
import me.nugumanov.shopmarket.models.Item;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StoreServiceImpl implements StoreService {

    private final Basket basket;

    public StoreServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void add(List<Long> ItemIds) {
        basket.addAll(ItemIds.stream()
                .map(Item::new)
                .collect(Collectors.toList()));
    }

    @Override
    public List<Item> get() {
        return basket.getAll();
    }
}
