package com.safari.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

//    @Before("execution(public void save())")
//    @Before("execution(void com.safari.springaop.service.UserService.save())")
//    @Before("execution(* com.safari.springaop.service.UserService.save())")
    @Before("execution(* com.safari.springaop.service.UserService.save*())")
    public void logInfo() {
        System.out.println(getClass() + "Logging Ino <=======================");
    }
}
