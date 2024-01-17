package com.bej.product.controller;

import com.bej.product.domain.Customer;
import com.bej.product.domain.Product;
import com.bej.product.exception.CustomerAlreadyExistsException;
import com.bej.product.exception.CustomerNotFoundException;
import com.bej.product.exception.ProductNotFoundException;
import com.bej.product.service.ICustomerProductService;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/v1")
public class CustomerProductController {
    // Autowire ICustomerProductService using constructor autowiring

    @PostMapping("/register")
    public ResponseEntity<?> registerCustomer(@RequestBody Customer customer) throws CustomerAlreadyExistsException {
        // Register a new user and save to db,
        // return 201 status if user is saved else 500 status
        return null;
    }

    @PostMapping("/customer/saveProduct")
    public ResponseEntity<?> saveCustomerProductToList(@RequestBody Product product, HttpServletRequest request) throws CustomerNotFoundException {
        // add a product to a specific customer,
        // return 201 status if product is saved else 500 status

        return null;
    }

    @GetMapping("/customer/getAllProducts")
    public ResponseEntity<?> getAllCustomerProductsFromList() throws CustomerNotFoundException {

        // list all products of a specific customer,
        // and return 200 status

        return null;
    }

    @DeleteMapping("/customer/{productCode}")
    public ResponseEntity<?> deleteCustomerProductFromList(@PathVariable String productCode) throws ProductNotFoundException, CustomerNotFoundException, ProductNotFoundException {

        // delete product of a specific customer,
        // return 200 status if product is deleted else 500 status

        return null;
    }
}
