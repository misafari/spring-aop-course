package com.safari.springaop;

import com.safari.springaop.config.AppConfig;
import com.safari.springaop.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAopApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean("userService", UserService.class);

        try {
            userService.save(false);
            userService.save(true);
        }catch (Exception e) {
            System.out.println("Handle In Main " + e.getMessage());
        }

        context.close();
    }

}
