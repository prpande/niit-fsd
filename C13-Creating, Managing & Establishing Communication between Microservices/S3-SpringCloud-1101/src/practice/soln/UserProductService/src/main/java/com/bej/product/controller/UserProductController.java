package com.bej.product.controller;

import com.bej.product.domain.Product;
import com.bej.product.domain.User;
import com.bej.product.exception.UserAlreadyExistsException;
import com.bej.product.service.IUserProductService;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
@RestController
@RequestMapping("/api/v2")
public class UserProductController {
    // Autowire IUserProductService using constructor autowiring
    private IUserProductService userProductService;
    private ResponseEntity<?> responseEntity;

    @Autowired
    public UserProductController(IUserProductService userProductService) {
        this.userProductService = userProductService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody User user) throws UserAlreadyExistsException {
        // Register a new user and save to db,
        // return 201 status if user is saved else 500 status
        try {
            responseEntity = new ResponseEntity<>(userProductService.registerUser(user), HttpStatus.CREATED);
        } catch (UserAlreadyExistsException ex) {
            throw ex;
        } catch (Exception ex) {
            responseEntity = get500Response(ex);
        }
        return responseEntity;
    }

    @PostMapping("/user/saveProduct")
    public ResponseEntity<?> saveProductToList(@RequestBody Product product, HttpServletRequest request) {
        // add a product to a specific user,
        // return 201 status if track is saved else 500 status
        try {
            responseEntity = new ResponseEntity<>(userProductService.saveUserProductToList(product, getIdFromClaims(request)), HttpStatus.CREATED);
        } catch (Exception ex) {
            responseEntity = get500Response(ex);
        }
        return responseEntity;
    }

    @GetMapping("/user/getAllProducts")
    public ResponseEntity<?> getAllProductsFromList(HttpServletRequest request) {
        // list all products of a specific user,
        // return 200 status if track is saved else 500 status
        try {
            responseEntity = new ResponseEntity<>(userProductService.getAllUserProductsFromList(getIdFromClaims(request)), HttpStatus.OK);
        } catch (Exception ex) {
            responseEntity = get500Response(ex);
        }
        return responseEntity;
    }

    @DeleteMapping("/user/{productCode}")
    public ResponseEntity<?> deleterProductFromList(@PathVariable String productCode, HttpServletRequest request) {
        // delete product of a specific user,
        // return 200 status if track is saved else 500 status
        try {
            responseEntity = new ResponseEntity<>(userProductService.deleteUserProductFromList(getIdFromClaims(request), productCode), HttpStatus.OK);
        } catch (Exception ex) {
            responseEntity = get500Response(ex);
        }
        return responseEntity;
    }

    // Read the user id present in the claims from the request
    private String getIdFromClaims(HttpServletRequest request) {
        Claims claims = (Claims) request.getAttribute("claims");
        return claims.getSubject();
    }

    private ResponseEntity<String> get500Response(Exception ex) {
        return new ResponseEntity<>(ex.toString(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
