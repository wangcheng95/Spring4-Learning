package com.waston.aop.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//使用@Aspect注解，表明Audience不仅是POJO，还是一个切面
@Aspect
public class Audience {
    public Audience() {}

    //下面使用 AspectJ 表达式来定义切点

    //表演之前，观众把手机设置静音
    @Before("execution(* com.waston.aop.service.Performace.perform())")
    public void silenceCellPhones() {
        System.out.println("观众把手机设置为静音");
    }

    //表演之前，观众坐下
    @Before("execution(* com.waston.aop.service.Performace.perform())")
    public void takeSeats() {
        System.out.println("观众坐下");
    }

    //演出精彩，观众热烈鼓掌
    @AfterReturning("execution(* com.waston.aop.service.Performace.perform())")
    public void applaud() {
        System.out.println("热烈鼓掌！！！");
    }

    //演出糟糕，观众要求退款
    @AfterThrowing("execution(* com.waston.aop.service.Performace.perform())")
    public void demandRefund() {
        System.out.println("观众要求退款！！！");
    }
}
