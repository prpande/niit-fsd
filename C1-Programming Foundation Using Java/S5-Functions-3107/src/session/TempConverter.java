package session;

import java.util.Scanner;
/*
 * Write a program to create a menu like
 * 1) Celsius to Fahrenheit
 * 2) Fahrenheit to Celsius
 * Enter your choice:
 * Create two functions with a parameter (celsius or fahrenheit value) and call appropriate function for conversion.
 */
public class TempConverter 
{
    public void toCelsius(float tempFahrenheit)
    {
        float tempCelsius = (tempFahrenheit - 32) * 5 / 9;
        System.out.format("%.2f Fahrenheit = %.2f Celsius\n", tempFahrenheit, tempCelsius);
    }

    public void toFahrenheit(float tempCelsius)
    {
        float tempFahrenheit = tempCelsius * 9 / 5 + 32;
        System.out.format("%.2f Celsius = %.2f Fahrenheit\n", tempCelsius, tempFahrenheit);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        TempConverter tempConverter = new TempConverter();
        int choice;
        float temperature;

        System.out.println("Select the conversion choice below:");
        System.out.println("1) Celsius to Fahrenheit");
        System.out.println("2) Fahrenheit to Celsius");

        choice = scanner.nextInt();
        System.out.println("Enter the temperature:");
        temperature = scanner.nextFloat();

        switch(choice)
        {
            case 1:
                tempConverter.toFahrenheit(temperature);
                break;
            case 2:
                tempConverter.toCelsius(temperature);
                break;
        }

        scanner.close();
    }
}
