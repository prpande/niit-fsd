package com.bej.springioc;

import org.springframework.context.annotation.Bean;

public class AppConfig 
{
	
	@Bean("customer")
	public Customer getCustomerDetails()
	{
		Customer customer = new Customer(getAddress());
		customer.setCustomerId(101);
		customer.setCustomerName("Henry");
		return customer;
	}
	
	@Bean
	public Address getAddress()
	{
		return new Address(23,
				"Dimora Street",
				"New Jersey",7831);
	}
}


