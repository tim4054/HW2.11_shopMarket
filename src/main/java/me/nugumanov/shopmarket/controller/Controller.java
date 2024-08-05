package me.nugumanov.shopmarket.controller;

import me.nugumanov.shopmarket.models.Item;
import me.nugumanov.shopmarket.services.StoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@RestController
@RequestMapping("/order")
@SessionScope
public class Controller {

    private final StoreService service;

    public Controller(StoreService service) {
        this.service = service;
    }

    @GetMapping("/add")
    public void add(@RequestParam("itemIds") List<Integer> itemIds) {
        service.add(itemIds);
    }

    @GetMapping("/get")
    public List<Item> get() {
        return service.get();
    }
}


