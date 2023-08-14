package com.jap.fibonacci;
import java.util.Scanner;
public class FibonacciSeries
{
    // Write the logic in the method to generate the next number in the Fibonacci series
    public long fibonacci(long number) 
    {
        if(number <  0)
        {
            return -1;
        }
        else if(number == 0)
        {
            return 0;
        }
        else if(number == 1)
        {
            return 1;
        }
        else
        {
            return fibonacci(number -1) + fibonacci(number - 2);
        }
    }
    
    // Print the series inside the method
    public void printFibonacciSeries(long number)
    {
        for(long i = 0; i < number; i++)
        {
            System.out.print(fibonacci(i) + " ");
        }

        System.out.println("");
    }
    
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        FibonacciSeries fib = new FibonacciSeries();
        // Call the  printFibonacciSeries() method and pass the value.

        System.out.println("Enter the number of fibonacci: ");        
        long number = scanner.nextLong();

        fib.printFibonacciSeries(number);
        scanner.close();
    }
}
