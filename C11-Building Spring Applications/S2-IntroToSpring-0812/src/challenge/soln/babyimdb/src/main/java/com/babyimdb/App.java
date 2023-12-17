package com.babyimdb;

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
        ApplicationContext context = new AnnotationConfigApplicationContext(MovieConfiguration.class);

        Movie mov1 = context.getBean("Shawshank", Movie.class);
        Movie mov2 = context.getBean("Godfather", Movie.class);

        System.out.println(mov1.toString());
        System.out.println(mov2.toString());
    }
}
