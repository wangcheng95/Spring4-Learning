package com.waston.javaConfigExample.config;

import com.waston.javaConfigExample.pojo.Person;
import com.waston.javaConfigExample.pojo.Student;
import com.waston.javaConfigExample.pojo.Teacher;
import com.waston.javaConfigExample.pojo.Work;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration 表明这是一个配置类，@Bean 注解会告诉 Spring 这个函数会返回一个对象，该对象要注册成上下文的 bean。
@Configuration
public class MainConfig {
    // 简单声明bean
    @Bean(name = "student")
    public Person getStudent(){
        return new Student();
    }

    @Bean(name = "randomPerson")
    public Person getRandomPerson(){
        int choice = (int)Math.floor(Math.random() * 2);
        if(choice == 0) {
            return new Student();
        }else {
            return new Teacher();
        }
    }

    //注入依赖。调用getRandomPerson()，但实际Spring会拦截所有对他的调用，确保返回的是Spring对象的bean
    @Bean(name = "work")
    public Work getWork(){
        return new Work(getRandomPerson());
    }
}
