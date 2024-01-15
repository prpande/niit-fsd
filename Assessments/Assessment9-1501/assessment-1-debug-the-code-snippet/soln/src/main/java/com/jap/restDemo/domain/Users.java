package com.jap.restDemo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {

    private String name;
    @Id
    private int userId;

    public Users() {
    }

    public Users(String name, int userId) {
        this.name = name;
        this.userId = userId;
    }

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

