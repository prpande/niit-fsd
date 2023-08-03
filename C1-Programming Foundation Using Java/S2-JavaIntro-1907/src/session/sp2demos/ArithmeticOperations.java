package session.sp2demos;

// Program to take two numbers and perform addition, subtraction, multiply and divide.
public class ArithmeticOperations 
{
    public static void main(String[] args)
    {
        int num1 = 71;
        int num2 = 12;

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        float division = (float)num1 / num2;

        System.out.println("Number 1:" + num1 + " Number 2: " + num2);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Division: " + division);
    }
}
