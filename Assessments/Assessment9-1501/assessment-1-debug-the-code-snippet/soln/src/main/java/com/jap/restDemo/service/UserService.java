package com.jap.restDemo.service;

import com.jap.restDemo.domain.Users;
import com.jap.restDemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    private UserRepository userRepository;

    @Autowired
    UserService(UserRepository userRepository) {

        this.userRepository = userRepository;
    }

    @Override
    public Users saveUser(Users user) {

        return userRepository.save(user);
    }

    @Override
    public List<Users> getAllUsers() {
        return (List<Users>) userRepository.findAll();
    }
}


