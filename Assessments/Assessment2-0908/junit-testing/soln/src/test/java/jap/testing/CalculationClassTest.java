package jap.testing;

import org.junit.Test;

import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;



public class CalculationClassTest 
{


    CalculationClass calculationClass = new CalculationClass();

    //setUp and tearDown
    @Before
    public void setUp()
    {
        calculationClass = new CalculationClass();
    }

    @After
    public void tearDown()
    {
        calculationClass = null;
    }


    // Test isNumberEven method by passing value 10
    @Test
    public void isNumberEvenWithEvenInputSuccess()
    {
        int number = 10;
        boolean expected = true;

        boolean actual = calculationClass.isNumberEven(number);
        assertEquals(expected, actual);
    }

    // Test isNumberEven method by passing value 11
    @Test
    public void isNumberEvenWithOddInputSuccess()
    {
        int number = 11;
        boolean expected = false;

        boolean actual = calculationClass.isNumberEven(number);
        assertEquals(expected, actual);
    }

    @Test
    public void addNumberSuccess()
    {
        int expected = calculationClass.addNumber(200,300);
        assertEquals(expected,500);
    }

    // Test reverseNumber method by passing 12345678, here expected value and actual value is equal
    @Test
    public void reverseNumberSuccess()
    {
        long number = 12345678l;
        long expected = 87654321l;

        long actual = calculationClass.reverseNumber(number);
        assertEquals(expected, actual);
    }


    //Test reverseNumber method by passing 234567233, here expected value and actual value is not equal
    @Test
    public void reverseNumberFailure()
    {
        long number = 234567233l;
        long expected = 234567223l;

        long actual = calculationClass.reverseNumber(number);
        assertNotEquals(expected, actual);
    }

    //Test the greatestOfThreeNumber method by passing three numbers
    @Test
    public void greatestOfThreeNumberSuccess()
    {
        long num1 = 3456l;
        long num2 = 1234l;
        long num3 = 6789l;
        long expected = num3;

        long actual = calculationClass.greatestOfThreeNumber(num1, num2, num3);
        assertEquals(expected, actual);
    }
}