package practice;

import java.util.Scanner;
import java.lang.Math;
/*
 * Practice 2: Fencing a Barn
 * Ron wants to build fences around his barn to keep the
 * animals separate. This will help him feed the animals
 * more easily and solve the problem of animals getting
 * mixed up. Ron plans to divide the area into three parts: a
 * square for the chickens, a circular area for the ducks,
 * and a rectangular area for the cows.
 * 
 * Create a program in Java to help Ron calculate the area
 * for each fence separately.
 */
public class AreaCalculator1 
{
   public static void main(String[] args)
   {
        Scanner scanner = new Scanner(System.in);
        int enclosureType;
        double area = 0;
        boolean invalidInput = false;

        System.out.println("Enter the type of enclosure to calculate the area.");
        System.out.println("1. Square for the chickens");
        System.out.println("2. Circular area for the ducks");
        System.out.println("3. Rectangular area for the cows");
        enclosureType = scanner.nextInt();

        switch(enclosureType)
        {
            case 1:
                System.out.println("Enter the side length of the enclosure:");
                double side = scanner.nextDouble();
                area = side * side;
                break;
            case 2:
                System.out.println("Enter the radius of the enclosure:");
                double radius = scanner.nextDouble();
                area = Math.PI * radius * radius;
                break;
            case 3:
                System.out.println("Enter the length of the enclosure:");
                double length = scanner.nextDouble();
                System.out.println("Enter the breadth of the enclosure:");
                double breadth = scanner.nextDouble();
                area = length * breadth;
                break;
            default:    
                invalidInput = true;
                System.out.println("Invalid enclosure type selected!");
        }

        if(!invalidInput)
        {
            System.out.format("Calculated area of enclosure: %.3f\n", area);
        }

        scanner.close();
   }
}
