package com.jap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringDemoTest {
    ReverseStringDemo reverseStringDemo;

    @Before
    public void setUp(){
        reverseStringDemo = new ReverseStringDemo();
    }

    @After
    public void tearDown(){
        reverseStringDemo = null;
    }

    @Test
    public void getReverseStringSuccess() {
        String reverse = reverseStringDemo.getReverseString("Technology");
        assertEquals("ygolonhceT",reverse);

        assertEquals("avaJ",reverseStringDemo.getReverseString("Java"));
    }
}