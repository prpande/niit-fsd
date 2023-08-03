package com.jap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseDigitTest 
{
    ReverseDigit reverseDigit;
    @Before
    public void setUp() 
    {
        reverseDigit = new ReverseDigit();
    }

    @After
    public void tearDown() 
    {   
        reverseDigit = null;
    }

    @Test
    public void givenInputPositiveNumberReverseTheDigit()
    {
        int number = 1234;
        int expectedOutput = 4321;

        int actualOutput = reverseDigit.getReverse(number);
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    public void givenInputNegativeNumberReverseTheDigit()
    {
        int number = -1234;
        int expectedOutput = -4321;

        int actualOutput = reverseDigit.getReverse(number);
        assertEquals(expectedOutput, actualOutput);
    }
}