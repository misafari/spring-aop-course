package com.safari.springaop.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public void save() {
        System.out.println("UserService Save Done.");
    }
}
