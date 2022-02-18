package com.safari.springaop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // this advice will run after the method (finally)
    // this advice does not have access to the exception
    // this advice does not have access to the result
    @After("execution(void save(*))")
    public void logInfo() {
        System.out.println(getClass() + "Logging Ino <=======================");
    }
}
