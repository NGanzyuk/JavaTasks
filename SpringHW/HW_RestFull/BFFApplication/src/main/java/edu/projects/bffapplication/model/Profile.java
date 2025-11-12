package edu.projects.bffapplication.model;

import java.util.List;

public class Profile {

    private UserModel user;
    private List<OrderModel> orders;


    public Profile() {
    }

    public Profile(UserModel user, List<OrderModel> orders) {
        this.user = user;
        this.orders = orders;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public List<OrderModel> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderModel> orders) {
        this.orders = orders;
    }


}
