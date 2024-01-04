package com.bej.authenticationservice.controller;


import com.bej.authenticationservice.domain.User;
import com.bej.authenticationservice.exception.UserAlreadyExistException;
import com.bej.authenticationservice.exception.UserNotFoundException;
import com.bej.authenticationservice.service.SecurityTokenGenerator;
import com.bej.authenticationservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {

    /*
     * Autowiring should be implemented for the UserService and SecurityTokenGenerator. (Use Constructor-based
     * autowiring) Please note that we should not create an object using the new
     * keyword
     */
    private UserService userService;
    private SecurityTokenGenerator securityTokenGenerator;

    private ResponseEntity<?> responseEntity;

    @Autowired
    public UserController(UserService userService, SecurityTokenGenerator securityTokenGenerator) {
        this.userService = userService;
        this.securityTokenGenerator = securityTokenGenerator;
    }

    // first step - register the User

    /*
     * Define a handler method which will save a specific User by reading the
     *  object from request body and save the User details in the
     * database. This handler method should return any one of the status messages
     * basis on different situations:
     * 1. 201(CREATED) - If the user saved successfully.
     * 2. 500(INTERNAL_SERVER_ERROR) - If the User already exists
     *
     * This handler method should map to the URL "/register" using HTTP POST method
     */
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody User user) throws UserAlreadyExistException {
        try {
            responseEntity = new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
        } catch (UserAlreadyExistException ex) {
            throw ex;
        } catch (Exception ex) {
            responseEntity = get500Response(ex);
        }

        return responseEntity;
    }

    // second step - login the customer


    /* Define a handler method which will authenticate a User by reading the User
     * object from request body containing the username and password. The username and password should be validated
     * before proceeding ahead with JWT token generation. The User credentials will be validated against the database entries.
     * The error should be return if validation is not successful. If credentials are validated successfully, then JWT
     * token will be generated. The token should be returned back to the caller along with the API response.
     * This handler method should return any one of the status messages basis on different
     * situations:
     * 1. 200(OK) - If login is successful
     * 2. 401(UNAUTHORIZED) - If login is not successful
     *
     * This handler method should map to the URL "/login" using HTTP POST method
     */
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user) {
        try {
            userService.findByUsernameAndPassword(user.getUsername(), user.getPassword());
            responseEntity = new ResponseEntity<>(securityTokenGenerator.generateToken(user), HttpStatus.OK);
        } catch (UserNotFoundException ex) {
            responseEntity = new ResponseEntity<>(ex.getMessage(), HttpStatus.UNAUTHORIZED);
        } catch (Exception ex) {
            responseEntity = get500Response(ex);
        }

        return responseEntity;
    }

    //     Define a handler method that will get all  User from the database the
    //     handler mapping url will be "/api/v1/userservice/users"
    //    Status will be
    //    1. 200(OK) - If all Users are successfully retrieved
    //    2. 500(INTERNAL_SERVER_ERROR) - If any other error occurs
    @GetMapping("/api/v1/userservice/users")
    public ResponseEntity<?> getAllUsers() {
        try {
            responseEntity = new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
        } catch (Exception ex) {
            responseEntity = get500Response(ex);
        }

        return responseEntity;
    }

    //    Define a handler method that will delete a  User
    //    the handler mapping url will be "/api/v1/userservice/{userId}"
    //    Status will be
    //    1. 200(OK) - If delete is successful
    //    2. 500(INTERNAL_SERVER_ERROR) - If any other error occurs
    @DeleteMapping("/api/v1/userservice/{userId}")
    public ResponseEntity<?> deleteUser(@PathVariable int userId) throws UserNotFoundException {
        try {
            userService.deleteUser(userId);
            responseEntity = new ResponseEntity<>("User Deleted", HttpStatus.OK);
        } catch (UserNotFoundException ex) {
            throw ex;
        } catch (Exception ex) {
            responseEntity = get500Response(ex);
        }

        return responseEntity;
    }

    private ResponseEntity<?> get500Response(Exception ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
