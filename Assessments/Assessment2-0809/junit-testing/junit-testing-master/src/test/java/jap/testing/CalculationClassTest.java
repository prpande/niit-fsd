package jap.testing;

import org.junit.Test;

import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;



public class CalculationClassTest {


    CalculationClass calculationClass = new CalculationClass();

    //setUp and tearDown


    // Test isNumberEven method by passing value 10

    // Test isNumberEven method by passing value 11


    @Test
    public void addNumberSuccess(){
        int expected = calculationClass.addNumber(200,300);
        assertEquals(expected,500);
    }

    // Test reverseNumber method by passing 12345678, here expected value and actual value is equal


    //Test reverseNumber method by passing 234567233, here expected value and actual value is not equal


    //Test the greatestOfThreeNumber method by passing three numbers

   



}