package com.bej.authentication.service;

import com.bej.authentication.domain.Customer;
import com.bej.authentication.exception.CustomerAlreadyExistsException;
import com.bej.authentication.exception.InvalidCredentialsException;
import com.bej.authentication.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements  ICustomerService{

    // Autowire the CustomerRepository using constructor autowiring


    @Override
    public Customer saveCustomer(Customer customer) throws CustomerAlreadyExistsException {
        //save the customer in the db
        return null;
    }

    @Override
    public Customer getCustomerByCustomerIdAndPassword(int customerId, String password) throws InvalidCredentialsException {
        //validate the customer


        return null;
    }

}
