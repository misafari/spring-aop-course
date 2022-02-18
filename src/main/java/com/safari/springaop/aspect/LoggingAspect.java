package com.safari.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class LoggingAspect {

    @Before("execution(public void save())")
    public void logInfo() {
        System.out.println(getClass() + "Logging Ino <=======================");
    }
}
