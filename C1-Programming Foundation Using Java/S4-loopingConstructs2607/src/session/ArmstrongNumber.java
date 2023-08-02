package session;
import java.util.Scanner;
/*
 * Program to accept a number and show whether it is Armstrong number or not.
 * Armstrong No is sum of the cubs of its digits. Eg.
 * 153 = 1*1*1 + 5*5*5 + 3*3*3 .
 */
public class ArmstrongNumber 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Enter a number:");
        number = scanner.nextInt();

        int cubeSum = 0;
        int quotient = number;
        while(quotient > 0)
        {
            int digit = quotient % 10;
            cubeSum += digit * digit * digit;
            quotient = quotient / 10;
        }

        if(cubeSum == number)
        {
            System.out.println(number + " is an Armstrong number.");
        }
        else
        {
            System.out.println(number + " is NOT an Armstrong number.");
        }

        scanner.close();
    }
}
