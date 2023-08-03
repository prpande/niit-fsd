package session.sp2demos;

// Program to take two numbers and swap them.
public class NumberSwap 
{
    public static void main(String[] args)
    {
        int num1 = 13;
        int num2 = 45;
        System.out.println("Before swap Number 1: " + num1 + " Number 2: " + num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swap Number 1: " + num1 + " Number 2: " + num2);
    }
}
