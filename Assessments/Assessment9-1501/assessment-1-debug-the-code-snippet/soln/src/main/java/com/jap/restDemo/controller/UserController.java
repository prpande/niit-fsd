package com.jap.restDemo.controller;


import com.jap.restDemo.domain.Users;
import com.jap.restDemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    private IUserService userService;

    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public ResponseEntity saveUser(@RequestBody Users user) {

        Users savedUser = userService.saveUser(user);
        return new ResponseEntity(savedUser, HttpStatus.CREATED);
    }

    @GetMapping("/users")
    public ResponseEntity getAllUsers() {
        List<Users> listOfUsers = userService.getAllUsers();
        return new ResponseEntity(listOfUsers, HttpStatus.OK);
    }
}


