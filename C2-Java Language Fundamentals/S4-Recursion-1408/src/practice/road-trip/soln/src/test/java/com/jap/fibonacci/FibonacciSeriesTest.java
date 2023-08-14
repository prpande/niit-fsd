package com.jap.fibonacci;

import com.jap.fibonacci.FibonacciSeries;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class FibonacciSeriesTest
{

    FibonacciSeries fib = null;
    @Before
    public void setUp(){
        fib = new FibonacciSeries();

    }
    @After
    public void tearDown(){
        fib = null;

    }

    @Test
    public void givenOneReturnOne()
    {
        assertEquals( 1,fib.fibonacci(1));
    }
    @Test
    public void givenZeroReturnOne()
    {
        assertEquals( 0,fib.fibonacci(0));
    }
    @Test
    public void givenANegativeIntegerReturnOne()
    {

        assertEquals( -1,fib.fibonacci(-8));
        assertNotEquals(34,fib.fibonacci(-9));
    }
}
