package com.waston.aop;

import com.waston.aop.config.ConcertConfig;
import com.waston.aop.service.Performace;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConcertConfig.class);
        Performace p = (Performace)context.getBean("concertPerformace");
        p.perform();
    }
}