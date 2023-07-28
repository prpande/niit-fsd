package session;
import java.util.Scanner;
/*
 * Write a program to accept a number and show its table.
 * 	Eg for input: 8
 * 	8 x 1 = 8
 *  8 x 2 = 16
 *  8 x 3 = 24
 *  8 x 4 = 32
 * ...
 * 8 x 10 = 80
 */
public class MultiplicationTable 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number, tableLimit = 10;

        System.out.println("Enter a number");
        number = Integer.parseInt(scanner.nextLine());

        for(int i = 1; i <= tableLimit; i++)
        {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}
