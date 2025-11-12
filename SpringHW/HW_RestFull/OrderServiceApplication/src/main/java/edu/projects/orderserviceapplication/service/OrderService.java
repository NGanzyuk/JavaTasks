package edu.projects.orderserviceapplication.service;

import edu.projects.orderserviceapplication.model.OrderModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    private final List<OrderModel> orders = new ArrayList<>();
    public OrderService() {
        orders.add(new OrderModel(1L, 1L, 3000.0, "RUB",
                new ArrayList<>(List.of("Steak", "Ribs"))));
        orders.add(new OrderModel(2L, 2L, 1.5,
                "USD", new ArrayList<>(List.of("Salade"))));
    }
    public List<OrderModel> getOrdersByUserId(Long userId) {
        return orders.stream().filter(order -> order.getUserId().equals(userId)).toList();
    }
}
