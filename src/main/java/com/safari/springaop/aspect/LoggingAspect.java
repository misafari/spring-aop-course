package com.safari.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @AfterThrowing(pointcut = "execution(public void save(boolean))", throwing = "ex")
    public void logInfo(JoinPoint joinPoint, Throwable ex) {
        System.out.println(getClass() + "Logging Ino <=======================");
        System.out.println(ex.getMessage());
    }

}
