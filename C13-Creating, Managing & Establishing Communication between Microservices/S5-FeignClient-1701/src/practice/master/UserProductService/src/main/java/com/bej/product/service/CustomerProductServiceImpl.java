package com.bej.product.service;

import com.bej.product.domain.Customer;
import com.bej.product.domain.Product;
import com.bej.product.exception.CustomerAlreadyExistsException;
import com.bej.product.exception.CustomerNotFoundException;
import com.bej.product.exception.ProductNotFoundException;

import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class CustomerProductServiceImpl implements ICustomerProductService{
    // Autowire the CustomerProductRepository using constructor autowiring

    @Override
    public Customer registerCustomer(Customer customer) throws CustomerAlreadyExistsException {
        // Register a new user
        return null;
    }



    @Override
    public Customer saveCustomerProductToList(Product product, int customerId) throws CustomerNotFoundException {
        // Save the product to the customer list
        return null;
    }

    @Override
    public Customer deleteCustomerProductFromList(int customerId, String productCode) throws CustomerNotFoundException, ProductNotFoundException {
        // Delete a product from the customer list
        return null;
    }

    @Override
    public List<Product> getAllUserProductsFromList(int customerId) throws CustomerNotFoundException {
        // Get all products from the customer list
        return null;

    }


}
