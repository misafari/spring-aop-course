package com.safari.springaop.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public void save(boolean arg) {
        System.out.println("UserService Save Done.");
    }
}
