package com.safari.springaop;

import com.safari.springaop.config.AppConfig;
import com.safari.springaop.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class SpringAopApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean("userService", UserService.class);

        List<String> users = null;
        try {
            users = userService.save(true);
        } catch (Exception e) {
            System.out.println("Main handler: " + e.getMessage());
        }

        System.out.println("In main");
        System.out.println(users);
        System.out.println("In main");

        context.close();
    }

}
