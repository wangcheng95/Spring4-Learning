package com.waston.aop.config;

import com.waston.aop.aspect.Audience;
import com.waston.aop.service.ConcertPerformace;
import com.waston.aop.service.Performace;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//@EnableAspectJAutoProxy表示开启AOP
@Configuration
@EnableAspectJAutoProxy
public class ConcertConfig {

    @Bean(name = "audience")
    public Audience audience(){
        return new Audience();
    }

    @Bean(name = "concertPerformace")
    public Performace concertPerformace(){
        return new ConcertPerformace();
    }
}
