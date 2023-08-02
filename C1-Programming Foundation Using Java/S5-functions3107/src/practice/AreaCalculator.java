package practice;

import java.util.Scanner;
/*
 * Practice 1: Fencing a Barn
 * Ron wishes to renovate his barn. He thinks that
 * creating fences and keeping the animals separate will
 * help him feed the animals more easily and prevent them
 * from getting mixed.
 * For this, he plans to divide the area into three parts. He
 * wishes to have a square area for the chickens, a circular
 * area for the ducks, and a rectangular area for the cows.
 * Write a program to help Ron calculate the area of
 * each fence.
 */
public class AreaCalculator 
{
    double PI = 3.14;
    public double calculateAreaOfSquare (double side)
    {
        double area  = side * side;
        System.out.println("Square Area " + area);
        return area;
    }

    public double calculateAreaOfCirc1e (double radius)
    {
        double area = PI * radius * radius;
        System.out.println("Circle area " + area);
        return area;
    }

    double calculateAreaOfRectang1e (double length, double breadth)
    {
        double area = length * breadth;
        System.out.println("Rectangle Area " + area);
        return area;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        AreaCalculator areaCalculator = new AreaCalculator();

        double side = scanner.nextInt();
        areaCalculator.calculateAreaOfSquare(side);

        double radius = scanner.nextInt();
        areaCalculator.calculateAreaOfCirc1e(radius);

        double length = scanner.nextInt();
        double breadth = scanner.nextInt();
        areaCalculator.calculateAreaOfRectang1e(length, breadth);

        scanner.close();
    }    
}
