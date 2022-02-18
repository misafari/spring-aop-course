package com.safari.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Pointcut("execution(public void com.safari.springaop.service.*.save*())")
    public void forServiceSaveMethods(){}

    @Pointcut("execution(public void com.safari.springaop.service.*.find*(..))")
    public void forServiceGetMethods(){}

    @Before("forServiceSaveMethods() && !forServiceGetMethods()")
//    @Before("forServiceSaveMethods() || forServiceGetMethods()")
//    @Before("forServiceSaveMethods() && forServiceGetMethods()")
//    @Before("com.safari.springaop.aspect.Pointcuts.forServiceMethods()")
    public void logInfo() {
        System.out.println(getClass() + "Logging Ino <=======================");
    }

    @Before("forServiceSaveMethods()")
//    @Before("com.safari.springaop.aspect.Pointcuts.forServiceMethods()")
    public void secondLogInfo() {
        System.out.println(getClass() + " Second Logging Ino <****************************");
    }
}
