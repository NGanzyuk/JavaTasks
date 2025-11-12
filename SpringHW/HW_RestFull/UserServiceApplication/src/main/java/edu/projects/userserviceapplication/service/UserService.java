package edu.projects.userserviceapplication.service;

import edu.projects.userserviceapplication.model.UserModel;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    private final Map<Long, UserModel> users = new HashMap<>();

    public UserService() {
        users.put(1L,
                new UserModel(1L, "Andrew", "Moscow",
                        "+79999999999", "test1@test.test"));
        users.put(2L,
                new UserModel(2L, "Jack", "New-York",
                        "+79888888888", "test2@test.test"));
    }

    public UserModel getUserById(Long id) {
        return users.get(id);
    }
}
