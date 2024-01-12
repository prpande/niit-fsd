package com.bej.product.controller;

import com.bej.product.domain.User;
import com.bej.product.domain.Product;
import com.bej.product.exception.UserAlreadyExistsException;
import com.bej.product.exception.UserNotFoundException;
import com.bej.product.exception.ProductNotFoundException;
import com.bej.product.service.IUserProductService;
import com.bej.product.util.JwtUtil;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/v1")
public class UserProductController {
    // Autowire IUserProductService using constructor autowiring

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody User user) {
        // Register a new user and save to db,
        // return 201 status if user is saved else 500 status
          return null;
    }

    @PostMapping("/user/saveProduct")
    public ResponseEntity<?> saveProductToList(@RequestBody Product product, HttpServletRequest request) {
        // add a product to a specific user,
        // return 201 status if track is saved else 500 status
       return null;
    }

    @GetMapping("/user/getAllProducts")
    public ResponseEntity<?> getAllProductsFromList(HttpServletRequest request)  {
        // list all products of a specific user,
        // return 200 status if track is saved else 500 status
        return null;
    }

    @DeleteMapping("/user/{productCode}")
    public ResponseEntity<?> deleterProductFromList(@PathVariable String productCode,HttpServletRequest request)  {
        // delete product of a specific user,
        // return 200 status if track is saved else 500 status
        return null;
    }

    // Read the user id present in the claims from the request
    private String getIdFromClaims(HttpServletRequest request){
       return null;
    }
}
