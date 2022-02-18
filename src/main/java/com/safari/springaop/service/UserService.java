package com.safari.springaop.service;

import com.safari.springaop.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    public List<String> save() {
        System.out.println("UserService Save Done.");
        return Arrays.asList("Param1", "Param2");
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();

        users.add(new User("admin", "123"));
        users.add(new User("user", "123"));

        return users;
    }
}
