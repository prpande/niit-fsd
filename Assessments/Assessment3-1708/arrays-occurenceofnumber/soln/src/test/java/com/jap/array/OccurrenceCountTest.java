package com.jap.array;

import com.jap.array.OccurrenceCount;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccurrenceCountTest {

    OccurrenceCount occurrenceCount;
    @Before
    public void setUp() {
        occurrenceCount = new OccurrenceCount();
    }

    @After
    public void tearDown(){
        occurrenceCount = null;
    }

    @Test
    public void countOccurrenceSuccess(){
        int []numberArray = {1,3,3,3,3,4,5,5};
        int expectedValue = occurrenceCount.countOccurrences(numberArray,numberArray.length,3);
        assertEquals(expectedValue,4);
    }
    @Test
    public void countOccurrenceSuccess1(){
        int []numberArray = {1,3,3,3,3,4,5,5,5,5,5,5};
        int expectedValue = occurrenceCount.countOccurrences(numberArray,numberArray.length,5);
        assertEquals(expectedValue,6);
    }
}