package me.nugumanov.shopmarket.models;

public class Item {
    private long id;
    private String tittle;
    public Item(long id, String tittle) {
        this.id = id;
        this.tittle = tittle;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    @Override
    public String toString() {
        return "Item{" +
                "ID=" + id +
                ", tittle='" + tittle + '\'' +
                '}';
    }


}
