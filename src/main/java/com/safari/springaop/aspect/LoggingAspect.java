package com.safari.springaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Aspect
@Component
public class LoggingAspect {

//    @Around("execution(* save(boolean))")
//    public Object logInfo(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        long start = System.currentTimeMillis();
//
//        Object result = proceedingJoinPoint.proceed();
//
//        long end = System.currentTimeMillis();
//        long duration = end - start;
//
//        System.out.println("Duration Log: " + duration + " millisecond");
//
//        return result;
//    }

//    @Around("execution(* save(boolean))")
//    public Object logInfoEx(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        long start = System.currentTimeMillis();
//        Object result;
//
//        try {
//            result = proceedingJoinPoint.proceed();
//        } catch (Exception e) {
//            System.out.println("AOP handler: " + e.getMessage());
//            result = new ArrayList<String>();
//        }
//
//        long end = System.currentTimeMillis();
//        long duration = end - start;
//
//        System.out.println("Duration Log: " + duration + " millisecond");
//
//        return result;
//    }

    @Around("execution(* save(boolean))")
    public Object logInfoEx2(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object result;

        try {
            result = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            System.out.println("AOP handler: " + e.getMessage());
            throw new Exception("changed exception");
//            throw e;
        }

        long end = System.currentTimeMillis();
        long duration = end - start;

        System.out.println("Duration Log: " + duration + " millisecond");

        return result;
    }

//    @Around("execution(* save())")
//    public Object logInfo2(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        long start = System.currentTimeMillis();
//
//        Object result = proceedingJoinPoint.proceed();
//
//        long end = System.currentTimeMillis();
//        long duration = end - start;
//
//        System.out.println("Duration Log: " + duration + " millisecond");
//
//        return new ArrayList<String>();
//    }

}
