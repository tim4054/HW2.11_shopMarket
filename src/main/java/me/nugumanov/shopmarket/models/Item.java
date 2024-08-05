package me.nugumanov.shopmarket.models;

public class Item {
    private long ID;

    public Item(long ID) {
        this.ID = ID;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "ItemNew{" +
                "ID=" + ID +
                '}';
    }
}
