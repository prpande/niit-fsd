package org.example.hellomaven;

/**
 * Hello world!
 *
 */
public class App 
{
    public int add(int num1, int num2)
    {
        return num1 + num2;
    }

    public double divide(double num1, double num2)
    {
        return num1/num2;
    }

    public boolean isEven(int num)
    {
        return (num % 2 == 0);
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
