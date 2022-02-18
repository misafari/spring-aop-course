package com.safari.springaop.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public void save(boolean withErr) throws Exception {
        System.out.println("UserService Save Done.");
        if (withErr) {
            throw new Exception("Dummy Exception");
        }
    }
}
