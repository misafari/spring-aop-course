package com.safari.springaop.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class UserService {

    public List<String> save(boolean withErr) throws Exception {
        System.out.println("UserService Save Done.");

        if (withErr) {
            throw new Exception("dummy exception");
        }

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        return Arrays.asList("Admin", "User");
    }
}
