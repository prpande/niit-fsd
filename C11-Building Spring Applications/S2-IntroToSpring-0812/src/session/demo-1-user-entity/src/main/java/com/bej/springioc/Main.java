package com.bej.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main 
{
	public static void main(String[] str){

	ApplicationContext context =
			new AnnotationConfigApplicationContext(AppConfig.class);
	User user = context.getBean("user1",User.class);
	System.out.println(user);
}


}



