package com.safari.springaop;

import com.safari.springaop.config.AppConfig;
import com.safari.springaop.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAopApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean("userService", UserService.class);

        var save = userService.save();
        var all = userService.getAllUsers();

        System.out.println("Result In Main");
        System.out.println(all);
        System.out.println("Result In Main");

        context.close();
    }

}
