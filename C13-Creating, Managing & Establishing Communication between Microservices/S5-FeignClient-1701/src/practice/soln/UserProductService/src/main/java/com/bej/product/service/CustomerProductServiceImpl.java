package com.bej.product.service;

import com.bej.product.domain.Customer;
import com.bej.product.domain.Product;
import com.bej.product.exception.CustomerAlreadyExistsException;
import com.bej.product.exception.CustomerNotFoundException;
import com.bej.product.exception.ProductNotFoundException;
import com.bej.product.proxy.CustomerProxy;
import com.bej.product.repository.CustomerProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CustomerProductServiceImpl implements ICustomerProductService {
    // Autowire the CustomerProductRepository using constructor autowiring
    private CustomerProductRepository customerProductRepository;
    private CustomerProxy customerProxy;

    @Autowired
    public CustomerProductServiceImpl(CustomerProductRepository customerProductRepository, CustomerProxy customerProxy) {
        this.customerProductRepository = customerProductRepository;
        this.customerProxy = customerProxy;
    }

    @Override
    public Customer registerCustomer(Customer customer) throws CustomerAlreadyExistsException {
        // Register a new user
        if (customerProductRepository.findById(customer.getCustomerId()).isPresent()) {
            throw new CustomerAlreadyExistsException();
        }

        Customer savedCustomer = customerProductRepository.save(customer);
        if(!savedCustomer.getCustomerEmail().isEmpty()){
            ResponseEntity<?> responseEntity = customerProxy.saveCustomer(savedCustomer);
            System.out.println("Saved customer: " + responseEntity.getBody());
        }

        return savedCustomer;
    }


    @Override
    public Customer saveCustomerProductToList(Product product, int customerId) throws CustomerNotFoundException {
        // Save the product to the customer list
        if (customerProductRepository.findById(customerId).isEmpty()) {
            throw new CustomerNotFoundException();
        }

        Customer foundCustomer = customerProductRepository.findById(customerId).get();
        List<Product> productList = foundCustomer.getProductList();

        if (productList == null) {
            productList = new ArrayList<>();
        }

        productList.add(product);
        foundCustomer.setProductList(productList);
        return customerProductRepository.save(foundCustomer);
    }

    @Override
    public Customer deleteCustomerProductFromList(int customerId, String productCode) throws CustomerNotFoundException, ProductNotFoundException {
        // Delete a product from the customer list
        if (customerProductRepository.findById(customerId).isEmpty()) {
            throw new CustomerNotFoundException();
        }

        Customer foundCustomer = customerProductRepository.findById(customerId).get();
        List<Product> productList = foundCustomer.getProductList();

        if (productList == null) {
            throw new ProductNotFoundException();
        }

        Product foundProduct = null;
        for (Product p : productList) {
            if (p.getProductCode().equals(productCode)) {
                foundProduct = p;
            }
        }

        if (foundProduct == null) {
            throw new ProductNotFoundException();
        }

        productList.remove(foundProduct);
        foundCustomer.setProductList(productList);
        return customerProductRepository.save(foundCustomer);
    }

    @Override
    public List<Product> getAllUserProductsFromList(int customerId) throws CustomerNotFoundException {
        // Get all products from the customer list
        if (customerProductRepository.findById(customerId).isEmpty()) {
            throw new CustomerNotFoundException();
        }

        Customer foundCustomer = customerProductRepository.findById(customerId).get();
        return foundCustomer.getProductList();
    }
}
