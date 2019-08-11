package com.waston.autowired.pojo;

import org.springframework.stereotype.Component;

//这个注解告诉Spring这是个组件，为其创建bean
@Component("student")
public class Student implements Person {
    public String getProfession() {
        return "Student";
    }
}