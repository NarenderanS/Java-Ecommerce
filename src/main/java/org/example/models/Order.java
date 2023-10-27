package org.example.models;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;

public class Order {
    private Timestamp id;
    private Date date;
    private ArrayList<Cart> cart;

    public Timestamp getId() {
        return id;
    }

    public void setId(Timestamp id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<Cart> getCart() {
        return cart;
    }

    public void setCart(ArrayList<Cart> cart) {
        this.cart = cart;
    }

}
