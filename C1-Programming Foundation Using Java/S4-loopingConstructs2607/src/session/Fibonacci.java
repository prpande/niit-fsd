package session;

import java.util.Scanner;
/*
 * Program to show the first n digits or the fibonacci series. Accept n as an input.
 */
public class Fibonacci 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int inpNum, lastNumber = 1, penultimateNumber = 0;

        System.out.println("Enter the no. of terms of Fibonacci sequence:");
        inpNum = scanner.nextInt();

        for(int i = 0; i < inpNum; i++)
        {
            System.out.print(lastNumber + " ");
            int nextNumber = lastNumber + penultimateNumber;
            penultimateNumber = lastNumber;
            lastNumber = nextNumber;
        }

        scanner.close();
    }
    
}
