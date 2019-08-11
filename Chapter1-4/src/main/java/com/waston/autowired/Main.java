package com.waston.autowired;

import com.waston.autowired.config.MainConfig;
import com.waston.autowired.pojo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(MainConfig.class);
        //自动装配在test文件中体现
        Person person = (Person) context.getBean("student");
        System.out.println(person.getProfession());;
    }
}
