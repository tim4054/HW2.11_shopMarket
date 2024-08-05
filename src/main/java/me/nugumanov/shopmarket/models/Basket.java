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
}
