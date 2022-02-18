package com.safari.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(public void save(*))")
    public void logInfo(JoinPoint joinPoint) {
        System.out.println(getClass() + "Logging Ino <=======================");

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();

        System.out.println("\nMethod signature : " + methodSignature);

        Object[] args = joinPoint.getArgs();

        System.out.print("Args: ");
        Arrays.stream(args).forEach(System.out::print);

        System.out.println();
        System.out.println();

    }
}
