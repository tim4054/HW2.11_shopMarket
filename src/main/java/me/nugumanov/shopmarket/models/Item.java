package me.nugumanov.shopmarket.models;

public class Item {
    private String tittle;
    private int price;

    public Item(String tittle, int price) {
        this.tittle = tittle;
        this.price = price;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
