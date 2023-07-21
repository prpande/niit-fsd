package session.sp2demos;

// Program to take temperature in Celsius and convert it to Fahrenheit and vice-versa.
public class TemperatureConversion 
{
    public static void main(String[] args)
    {
        float tempCelsius = 25f;
        float tempFahrenheit = (tempCelsius * 1.8f) + 32f;

        System.out.println("Celsius Temperature: " + tempCelsius);
        System.out.println("Converted Fahrenheit Temperature: " + tempFahrenheit);

        tempCelsius = (tempFahrenheit - 32f) * 5 / 9f;
        System.out.println("Fahrenheit Temperature: " + tempFahrenheit);
        System.out.println("Converted Celsius Temperature: " + tempCelsius);
    }
}
