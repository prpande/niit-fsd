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
@RequestMapping("/api/v2")
public class CustomerProductController {
    // Autowire ICustomerProductService using constructor autowiring
    private ICustomerProductService customerProductService;
    private ResponseEntity<?> responseEntity;

    @Autowired
    public CustomerProductController(ICustomerProductService customerProductService) {
        this.customerProductService = customerProductService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerCustomer(@RequestBody Customer customer) throws CustomerAlreadyExistsException {
        // Register a new user and save to db,
        // return 201 status if user is saved else 500 status
        try {
            responseEntity = new ResponseEntity<>(customerProductService.registerCustomer(customer), HttpStatus.CREATED);
        } catch (CustomerAlreadyExistsException ex) {
            throw ex;
        } catch (Exception ex) {
            responseEntity = get500Response(ex);
        }

        return responseEntity;
    }

    @PostMapping("/customer/saveProduct")
    public ResponseEntity<?> saveCustomerProductToList(@RequestBody Product product, HttpServletRequest request) throws CustomerNotFoundException {
        // add a product to a specific customer,
        // return 201 status if product is saved else 500 status
        try {
            responseEntity = new ResponseEntity<>(customerProductService.saveCustomerProductToList(product, getIdFromClaims(request)), HttpStatus.CREATED);
        } catch (CustomerNotFoundException ex) {
            throw ex;
        } catch (Exception ex) {
            responseEntity = get500Response(ex);
        }

        return responseEntity;
    }

    @GetMapping("/customer/getAllProducts")
    public ResponseEntity<?> getAllCustomerProductsFromList(HttpServletRequest request) throws CustomerNotFoundException {

        // list all products of a specific customer,
        // and return 200 status
        try {
            responseEntity = new ResponseEntity<>(customerProductService.getAllUserProductsFromList(getIdFromClaims(request)), HttpStatus.OK);
        } catch (CustomerNotFoundException ex) {
            throw ex;
        } catch (Exception ex) {
            responseEntity = get500Response(ex);
        }

        return responseEntity;
    }

    @DeleteMapping("/customer/{productCode}")
    public ResponseEntity<?> deleteCustomerProductFromList(@PathVariable String productCode, HttpServletRequest request) throws CustomerNotFoundException, ProductNotFoundException {

        // delete product of a specific customer,
        // return 200 status if product is deleted else 500 status
        try {
            responseEntity = new ResponseEntity<>(customerProductService.deleteCustomerProductFromList(getIdFromClaims(request), productCode), HttpStatus.OK);
        } catch (CustomerNotFoundException ex) {
            throw ex;
        } catch (ProductNotFoundException ex) {
            throw ex;
        } catch (Exception ex) {
            responseEntity = get500Response(ex);
        }

        return responseEntity;
    }

    // Read the user id present in the claims from the request
    private int getIdFromClaims(HttpServletRequest request) {
        Claims claims = (Claims) request.getAttribute("claims");
        return Integer.parseInt(claims.getSubject());
    }

    private ResponseEntity<String> get500Response(Exception ex) {
        return new ResponseEntity<>(ex.toString(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
