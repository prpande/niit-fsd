package com.bej.customer.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.NOT_FOUND , reason = "Customer with specified Name is not found")
public class CustomerNotFoundException extends Exception{
}
