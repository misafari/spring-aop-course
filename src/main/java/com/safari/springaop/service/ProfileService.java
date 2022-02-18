package com.safari.springaop.service;

import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    public void save() {
        System.out.println("ProfileService Save Done.");
    }
}
