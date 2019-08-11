package com.waston.aop.aspect;

import java.util.Date;

public class CustomerServiceAspect {

    // 记录方法调用时时间
    public void logBeforeMethod(){
        System.out.println("\n方法调用时间：" + new Date());
    }

    //方法调用后时间
    public void logAfterMethod(){
        System.out.println("方法完成时间：" + new Date());
    }

    //异常发生时间
    public void logException(){
        System.out.println("\n异常发生时间：" + new Date());
    }
}