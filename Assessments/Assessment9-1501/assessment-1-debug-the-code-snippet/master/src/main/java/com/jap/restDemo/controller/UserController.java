package com.jap.restDemo.controller;


import com.jap.restDemo.domain.User;
import com.jap.restDemo.service.IUserService;
import com.jap.restDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/api/v1")
public class UserController {

    @PostMapping("/user")
    public ResponseEntity saveUser(@RequestBody User user){
        User savedUser = userService.saveUser(user);
       return new ResponseEntity(savedUser, HttpStatus.CREATED);
    }
    @GetMapping("/users")
    public ResponseEntity getAllUsers(){
        List<User> listOfUsers = userService.getAllUsers();
        return new ResponseEntity(listOfUsers, HttpStatus.OK);
    }



}


