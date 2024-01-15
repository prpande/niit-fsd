package com.jap.restDemo.service;

import com.jap.restDemo.domain.Users;

import java.util.List;

public interface IUserService {

    Users saveUser(Users user);
    List<Users> getAllUsers();

}
