package edu.projects.bffapplication.model;

import java.util.ArrayList;

public class OrderModel {
    private Long id;
    private Long userId;
    private Double price;
    private String currency;
    private ArrayList<String> items;

    public OrderModel() {
    }

    public OrderModel(Long id, Long userId, Double price, String currency, ArrayList<String> items) {
        this.id = id;
        this.userId = userId;
        this.price = price;
        this.currency = currency;
        this.items = items;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public ArrayList<String> getItems() {
        return items;
    }

}