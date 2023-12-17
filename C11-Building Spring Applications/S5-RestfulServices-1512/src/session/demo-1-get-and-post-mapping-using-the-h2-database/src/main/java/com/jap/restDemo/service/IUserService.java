package com.jap.restDemo.service;

import com.jap.restDemo.domain.User;

import java.util.List;

public interface IUserService {

    User saveUser(User user);
    List<User> getAllUsers();

}
