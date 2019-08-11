package com.waston.aop.service;
import lombok.Data;

@Data
public class CustomerService {
    private String name;
    private String email;

    public void printName(){
        System.out.println("Customer name: " + this.name);
    }

    public void printEmail(){
        System.out.println("Customer email: " + this.email);
    }

    public void throwException(){
        throw new IllegalArgumentException();
    }
}
