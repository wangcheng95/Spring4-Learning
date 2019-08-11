package com.waston.ioc;

/**
 * Work 打印Person实例的职业
 */
public class Work {
    private Person p;

    public Work(Person p) {
        this.p = p;
    }

    public void showProfession(){
        System.out.println("I am a " + p.getProfession() + ".");
    }
}