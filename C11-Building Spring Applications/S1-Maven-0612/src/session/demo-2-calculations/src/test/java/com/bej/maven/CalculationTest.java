package com.bej.maven;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CalculationTest
{
    Calculation calculation = null;
   @Before
   public void setUp(){
       calculation = new Calculation();
   }
    @After
    public void tearDown(){
        calculation = null;
    }

    @Test
    public void givenTwoNumberReturnSum(){
       assertEquals(25,calculation.addition(12,13));
    }
    @Test
    public void givenTwoNumberReturnDifference(){
        assertEquals(2,calculation.subtraction(20,18));
    }
    @Test
    public void givenTwoNumberReturnProduct(){
        assertEquals(100,calculation.multiplication(10,10));
    }
    @Test
    public void givenTwoNumberReturnQuotient(){
        assertEquals(1,calculation.division(13,13));
    }
}
