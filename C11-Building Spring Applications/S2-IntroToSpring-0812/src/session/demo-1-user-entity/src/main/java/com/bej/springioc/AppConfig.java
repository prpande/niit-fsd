package com.bej.springioc;

import org.springframework.context.annotation.Bean;

public class AppConfig 
{
	
	@Bean("user1")
	public User getUser1()
	{
		return new User(1,"Kantha","one@12345");
	}
	
	@Bean("user2")
	public User getUser2()
	{
		return new User(2,"Sam","not#12345");
	}
}


