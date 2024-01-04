package com.bej.customer.service;

import com.bej.customer.domain.Customer;
import com.bej.customer.exception.CustomerAlreadyExistException;
import com.bej.customer.exception.CustomerNotFoundException;
import com.bej.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService{

//    Autowire Repository layer




    @Override
    public Customer saveCustomer(Customer customer) throws CustomerAlreadyExistException {

        //check if customer is present if condition is true then throw the exception CustomerAlreadyExistException
        //else save the customer object
        //and return the saved customer object


        return customer;
    }

    @Override
    public boolean deleteCustomer(int customerId) throws CustomerNotFoundException {

        //find the customerid if its empty then throw CustomerNotFoundException
        //else delete the customer
        //return true if successfully deleted


        return false;

    }

    @Override
    public Customer findByUsernameAndPassword(String username , String password) throws CustomerNotFoundException {
                // get the customer by calling findByCustomerNameAndCustomerPassword method
        // if customer is not null then return the customer object

        Customer customer = new Customer();
        return customer;

    }

    @Override
    public List<Customer> getAllCustomer() throws Exception {

        // return all the customer from database

        return new ArrayList<>();

    }


}
