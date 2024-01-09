package com.bej.authenticationservice.controller;


import com.bej.authenticationservice.domain.User;
import com.bej.authenticationservice.security.SecurityTokenGenerator;
import com.bej.authenticationservice.service.UserService;
import com.bej.authenticationservice.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController

public class UserController {

  private ResponseEntity<?> responseEntity;
  private UserService userService;
  private SecurityTokenGenerator securityTokenGenerator;


  @Autowired
  public UserController(UserService userService , SecurityTokenGenerator securityTokenGenerator)
  {
    this.userService = userService;
    this.securityTokenGenerator = securityTokenGenerator;
  }

  @PostMapping("/login")
  public ResponseEntity<?> loginUser(@RequestBody User user) throws UserNotFoundException {
    Map<String, String> map = null;
    try {
      User userObj = userService.findByUsernameAndPassword(user.getUsername(), user.getPassword());
      if (userObj.getUsername().equals(user.getUsername())) {
        map = securityTokenGenerator.generateToken(user);
      }
      responseEntity = new ResponseEntity<>(map, HttpStatus.OK);
    }
  catch(UserNotFoundException e){
      throw new UserNotFoundException();
  }
    catch (Exception e){
      responseEntity = new ResponseEntity<String>("Try after sometime!!!", HttpStatus.INTERNAL_SERVER_ERROR);
    }
    return responseEntity;
  }

  @PostMapping("/register")
  public ResponseEntity<?> saveUser(@RequestBody User user) {
      return responseEntity = new ResponseEntity<User>(userService.saveUser(user) , HttpStatus.CREATED);
  }

  @GetMapping("api/v1/users")
  public ResponseEntity<?> getAllUsers() throws UserNotFoundException{
    List<User> userList =  userService.getAllUsers();
    responseEntity = new ResponseEntity<>(userList, HttpStatus.OK);
    return responseEntity;

  }



}
