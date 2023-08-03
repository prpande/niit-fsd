package session;
import java.util.Scanner;

/*
 * Creating a Simple Calculator
 * Write a program to create a simple calculator that performs
 * addition, subtraction, multiplication, and division based on the user input.
 * The program takes the value of both the numbers (entered by the
 * user) and then the user is asked to enter the operation (+, -, * and /), 
 * based on the input program performing the selected
 * operation on the entered numbers using Switch Case.
 */

public class Calculator 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result = 0;
        String operation;
        boolean invalid = false;

        System.out.println("Enter num1:");
        num1 = scanner.nextDouble();
        System.out.println("Enter num2:");
        num2 = scanner.nextDouble();

        System.out.println("Enter operation(+, -, * or /):");
        operation = scanner.next();

        switch(operation)
        {
            case "+": result = num1 + num2;
                break;
            case "-": result = num1 + num2;
                break;
            case "*": result = num1 + num2;
                break;
            case "/": result = num1 + num2;
                break;
            default: System.out.println("Invalid operation entered!");
                invalid = true;
        }

        if(!invalid)
        {
            System.out.format("Result: %f %s %f = %f", num1, operation, num2, result);
        }

        scanner.close();
    }
}
