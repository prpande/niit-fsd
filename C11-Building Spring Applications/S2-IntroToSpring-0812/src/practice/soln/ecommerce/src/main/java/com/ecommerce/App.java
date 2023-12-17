package com.ecommerce;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProductConfiguration.class);

        Product mouseInfo = context.getBean("Mouse", Product.class);
        Product keyboardInfo = context.getBean("Keyboard", Product.class);

        System.out.println(mouseInfo.toString());
        System.out.println(keyboardInfo.toString());
    }
}
