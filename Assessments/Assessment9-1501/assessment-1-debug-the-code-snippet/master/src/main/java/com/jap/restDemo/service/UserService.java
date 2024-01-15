package com.jap.restDemo.service;

import com.jap.restDemo.domain.User;
import com.jap.restDemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public class UserService implements IUserService{

    private UserRepository userRepository;
    @Autowired
    UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public User saveUser(User user) {
        return null;
    }
    @Override
    public List<User> getAllUsers() {
        return null;
    }
}


