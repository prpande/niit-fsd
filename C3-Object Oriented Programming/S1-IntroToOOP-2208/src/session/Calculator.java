package session;
/*
 * Write a program to create a class Calculator with two attributes num1 and num2 of double type. create four methods add,sub,multiply,divide.
 * All four methods take two parameter of double type and do calculation and show result. In main function create a menu like:
 * 
 * 1.Add
 * 2.sub
 * 3.multiply
 * 4.divide
 * 
 * Enter your choice(1-4)
 * use switch case and call the function.
 */
import java.util.Scanner;
public class Calculator 
{
    double num1;
    double num2;

    public void set(double a, double b)
    {
        num1 = a;
        num2 = b;
    }

    public void add()
    {
        double result = num1 + num2;
        System.out.format("%f + %f = %f\n", num1, num2, result);
    }

    public void subtract()
    {
        double result = num1 - num2;
        System.out.format("%f - %f = %f\n", num1, num2, result);
    }

    public void multiply()
    {
        double result = num1 * num2;
        System.out.format("%f x %f = %f\n", num1, num2, result);
    }

    public void divide()
    {
        double result = num1 / num2;
        System.out.format("%f / %f = %f\n", num1, num2, result);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Enter first number:");
        double a = scanner.nextDouble();
        System.out.println("Enter second number:");
        double b = scanner.nextDouble();

        calculator.set(a, b);

        System.out.println("Select from the operations below:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("Choice: ");

        int choice = scanner.nextInt();

        switch(choice)
        {
            case 1:
                calculator.add();
                break;
            case 2:
                calculator.subtract();
                break;
            case 3:
                calculator.multiply();
                break;
            case 4:
                calculator.divide();
                break;
            default:
                System.out.println("Invalid choice made!");
                break;
        }

        scanner.close();
    }
}
