package session;
import java.util.Scanner;
/*
 * Number Exceeds 999
 * Write a program that accepts a series of numbers from a user
 * and stops by displaying an appropriate message when the sum
 * of the numbers exceeds 999.
 */
public class SumLimit 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int limit = 999, sum = 0;
        do
        {
            System.out.println("Enter a number:");
            int num = scanner.nextInt();
            sum += num;

        }while(sum <= limit);

        System.out.println("Sum of input numbers exceeded " + limit);

        scanner.close();
    }
}
