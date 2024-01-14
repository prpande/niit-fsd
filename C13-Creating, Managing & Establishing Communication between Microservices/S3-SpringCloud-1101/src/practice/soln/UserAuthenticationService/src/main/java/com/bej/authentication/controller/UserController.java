package com.bej.authentication.controller;

import com.bej.authentication.exception.UserAlreadyExistsException;
import com.bej.authentication.exception.InvalidCredentialsException;
import com.bej.authentication.security.SecurityTokenGenerator;
import com.bej.authentication.service.IUserService;
import com.bej.authentication.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    // Autowire the IUserService, SecurityTokenGenerator using constructor autowiring
    private IUserService userService;
    private SecurityTokenGenerator securityTokenGenerator;
    private ResponseEntity<?> responseEntity;


    @Autowired
    public UserController(IUserService userService, SecurityTokenGenerator securityTokenGenerator) {
        this.userService = userService;
        this.securityTokenGenerator = securityTokenGenerator;
    }

    @PostMapping("/saveUser")
    public ResponseEntity<?> saveCustomer(@RequestBody User user) throws UserAlreadyExistsException {
        // Write the logic to save a user,
        // return 201 status if user is saved else 500 status
        try {
            responseEntity = new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
        } catch (UserAlreadyExistsException ex) {
            throw ex;
        } catch (Exception ex) {
            responseEntity = get500Response(ex);
        }

        return responseEntity;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user) {
        // Generate the token on login,
        // return 200 status if user is saved else 500 status
        try {
            User foundUser = userService.getUserByUserIdAndPassword(user.getUserId(), user.getPassword());
            responseEntity = new ResponseEntity<>(securityTokenGenerator.createToken(foundUser), HttpStatus.OK);
        } catch (Exception ex) {
            responseEntity = get500Response(ex);
        }

        return responseEntity;
    }

    private ResponseEntity<String> get500Response(Exception ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
