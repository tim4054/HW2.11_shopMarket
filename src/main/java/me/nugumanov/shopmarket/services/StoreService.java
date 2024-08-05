package me.nugumanov.shopmarket.services;

import me.nugumanov.shopmarket.models.Item;

import java.util.List;

public interface StoreService {
    void add(List<Integer> ItemIds);

    List<Item> get();
}
