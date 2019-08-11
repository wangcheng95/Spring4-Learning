package com.waston.xml.pojo;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String name;
    private String address;

    public User() {
    }

    public User(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

}
