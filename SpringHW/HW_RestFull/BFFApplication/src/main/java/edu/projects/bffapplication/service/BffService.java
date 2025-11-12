package edu.projects.bffapplication.service;

import edu.projects.bffapplication.model.OrderModel;
import edu.projects.bffapplication.model.Profile;
import edu.projects.bffapplication.model.UserModel;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class BffService {
    private final RestTemplate restTemplate = new RestTemplate();

    public Profile getUserProfile(Long userId) {
        String userUrl = "http://localhost:8081/api/users/" + userId;
        UserModel user = restTemplate.getForObject(userUrl, UserModel.class);

        String ordersUrl = "http://localhost:8082/api/orders/by-user/" + userId;
        OrderModel[] ordersArray = restTemplate.getForObject(ordersUrl, OrderModel[].class);
        List<OrderModel> orders = List.of(ordersArray);

        return new Profile(user, orders);
    }
}