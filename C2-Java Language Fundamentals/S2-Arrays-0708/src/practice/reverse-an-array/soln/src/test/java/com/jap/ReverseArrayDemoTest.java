package com.jap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseArrayDemoTest {
    ReverseArrayDemo reverseArrayDemo;

    @Before
    public void setUp(){
        reverseArrayDemo = new ReverseArrayDemo();
    }

    @After
    public void tearDown(){
        reverseArrayDemo = null;
    }

    @Test
    public void givenPositiveNumberArrayReverseArray() {

        int array[]={34,45,56,78,32,79,89,90};
        int reverse[] = reverseArrayDemo.getReverseArray(array);
        assertArrayEquals(new int[]{90,89,79,32,78,56,45,34},reverse);

    }
    @Test
    public void givenNegativeNumberArrayReverseArray() {

        int array[]={34,45,56,78,-32,79,-89,90};
        int reverse[] = reverseArrayDemo.getReverseArray(array);
        assertArrayEquals(new int[]{90,-89,79,-32,78,56,45,34},reverse);

    }
}