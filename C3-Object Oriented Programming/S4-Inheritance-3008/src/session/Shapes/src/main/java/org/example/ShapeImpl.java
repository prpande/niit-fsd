package org.example;

public class ShapeImpl
{
    public static void main(String[] args)
    {
        Shape circle = new Circle(10);
        Shape rectangle = new Rectangle(5,7);

        System.out.printf("Area of circle\t\t:\t%.2f\n", circle.calculateArea());
        System.out.printf("Area of rectangle\t:\t%.2f\n", rectangle.calculateArea());
    }
}
