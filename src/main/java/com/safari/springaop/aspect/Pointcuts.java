package com.safari.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {
    @Pointcut("execution(public void com.safari.springaop.service.*.save())")
    public void forServiceMethods(){}
}
