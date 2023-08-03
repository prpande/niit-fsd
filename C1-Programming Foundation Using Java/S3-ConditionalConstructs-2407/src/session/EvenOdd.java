package session;

import java.util.Scanner;
/*
 * Program to accept a number and if number is even number, show square of number otherwise show cube of number.
 */
public class EvenOdd 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int input;

        System.out.println("Enter the number:");
        input = scanner.nextInt();

        int remainder = input % 2;
        switch(remainder)
        {
            case 0:
                long square = input * input;
                System.out.format("%d is even. %d ^ 2 = %d\n", input, input, square);
                break;
            case 1:
                long cube = input * input * input;
                System.out.format("%d is odd. %d ^ 3 = %d\n", input, input, cube);
                break;
        }

        scanner.close();
    }
}
