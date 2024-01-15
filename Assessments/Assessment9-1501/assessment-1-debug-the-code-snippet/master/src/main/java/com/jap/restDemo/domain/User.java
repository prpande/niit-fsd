package com.jap.restDemo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;


public class User {

    private String name;
    @Id
    private int userId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}

