package com.waston.aop;
import com.waston.aop.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        CustomerService service = (CustomerService)context.getBean("customerService");

        // 执行逻辑代码
        service.printName();
        service.printEmail();

        try{
            service.throwException();
        } catch (Exception e){
            System.out.println("service 发生异常");
        }
    }
}