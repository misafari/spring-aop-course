package com.safari.springaop;

import com.safari.springaop.config.AppConfig;
import com.safari.springaop.service.ProfileService;
import com.safari.springaop.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAopApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean("userService", UserService.class);
        ProfileService profileService = context.getBean("profileService", ProfileService.class);

        userService.save();
        profileService.save();

        context.close();
    }

}
