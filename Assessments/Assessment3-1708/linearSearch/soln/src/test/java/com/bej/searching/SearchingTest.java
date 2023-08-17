package com.bej.searching;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchingTest {
    Searching searching = null;
    int[] arr = null;
    int[] arr1 = null;
    int[] arr2 = null;
    @Before
    public void setUp(){
        searching = new Searching();
        arr = new int[]{5,34,1,2,7,8,23,5,9,3,5,7,8};
        arr1 = new int[]{-9,-4,-7,-8,-23,-99,-66};
        arr2 = new int[]{56,-22,12,6,0,3,-2,66,-8,9};
    }
    @After
    public void tearDown()
    {
        searching = null;
        arr = null;
    }
    @Test
    public void givenAPositiveArraySearchForElement(){
        int expectedOutput = 1;
        int actualOutput = searching.search(arr,34);
        assertEquals(expectedOutput,actualOutput);
    }
    @Test
    public void givenANegativeArraySearchForElement(){
        int expectedOutput = 2;
        int actualOutput = searching.search(arr1,-7);
        assertEquals(expectedOutput,actualOutput);
    }
    @Test
    public void givenANegativeAndPositiveArraySearchForElement(){
        int expectedOutput = 6;
        int actualOutput = searching.search(arr2,-2);
        assertEquals(expectedOutput,actualOutput);
    }
    @Test
    public void givenAnArraySearchForElement(){
        int actualOutput = searching.search(arr1,23);
        assertEquals(-1,actualOutput);
    }
}
