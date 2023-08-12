package com.jap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxAgeTest {
    MaxAge maxAge;


    @Before
    public void setUp()  {
        maxAge = new MaxAge();
    }
    @Test
    public void getMaxAgeSuccess(){
        int[]age = {23,24,25,34,33,35,36,27,28};
        int actualResult = maxAge.getMaxAge(age);
        assertEquals(36,actualResult);
    }


    @After
    public void tearDown()  {
        maxAge = null;
    }
}