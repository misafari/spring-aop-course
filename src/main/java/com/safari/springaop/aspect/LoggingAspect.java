package com.safari.springaop.aspect;

import com.safari.springaop.model.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Aspect
@Component
public class LoggingAspect {

    @AfterReturning(pointcut = "execution(* save())", returning = "result")
    public void logInfo(JoinPoint joinPoint, List<String> result) {
        System.out.println(getClass() + "Logging Ino <=======================");

        System.out.println("Result: " + result);
    }

    // do not modifier result (bad practices)
    @AfterReturning(pointcut = "execution(* getAllUsers())", returning = "result")
    public void logInfoWithModifyingResult(JoinPoint joinPoint, List<User> result) {
        System.out.println(getClass() + "Logging Ino <=======================");

        result.forEach(user -> {
            var pass = user.getPassword();
            user.setPassword(pass + "abc");
        });
    }
}
