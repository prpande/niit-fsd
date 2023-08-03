package session;
import java.util.Scanner;
/*
 * Program to accept a number and compute its factorial.
 */
public class Factorial 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int inputNum;
        long factorial = 1l;

        System.out.println("Enter a number:");
        inputNum = scanner.nextInt();
        
        for(int i = 1; i <= inputNum; i++)
        {
            factorial *= i; 
        }

        System.out.format("%d! = %d\n", inputNum, factorial);

        scanner.close();
    }
}
