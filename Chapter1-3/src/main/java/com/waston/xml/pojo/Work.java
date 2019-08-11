package com.waston.xml.pojo;

import lombok.Data;

@Data
public class Work {
    private User user;

    public Work() {
    }

    public Work(User user) {
        this.user = user;
    }

    public void work(){
        System.out.println(user.getName() + " is working!");
    }
}
