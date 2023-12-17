package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(OrganizationConfiguration.class);

        Employee emp = context.getBean(Employee.class);

        System.out.println(emp.toString());
    }
}
