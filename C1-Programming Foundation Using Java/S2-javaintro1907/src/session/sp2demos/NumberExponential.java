package session.sp2demos;

// Program to take a number and display its square and cube.
public class NumberExponential 
{
    public static void main(String[] args)    
    {
        int num = 23;
        
        long square = num * num;
        long cube = num * num * num;

        System.out.println("Number: " + num);
        System.out.println("Square: " + square);
        System.out.println("Cube: " + cube);
    }
}
