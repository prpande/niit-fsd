package com.bej.springioc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main 
{
	public static void main(String[] str){

		ApplicationContext ctx =
				new AnnotationConfigApplicationContext(AppConfig.class);
			Customer customer = ctx.getBean("customer", Customer.class);
		System.out.println();
		System.out.println();
			System.out.println(customer);

	}
}



