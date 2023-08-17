package com.bej.sorting.commander;

import com.bej.sorting.Sorting;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortingTest {
    Sorting sorting = null;
    int[] arr = null;
    int[] arr1 = null;
    int[] arr2 = null;
    @Before
    public void setUp(){
        sorting = new Sorting();
        arr = new int[]{5,34,1,2,7,8,23,5,9,3,5,7,8};
        arr1 = new int[]{-9,-4,-7,-8,-23,-99,-66};
        arr2 = new int[]{56,-22,12,6,0,3,-2,66,-8,9};
    }
    @After
    public void tearDown()
    {
        sorting = null;
        arr = null;
    }
    @Test
    public void givenAPositiveArraySortInAscendingOrder(){
        int[] expectedOutput = new int[]{1,2,3,5,5,5,7,7,8,8,9,23,34};
        int[] actualOutput = sorting.sort(arr);
        assertArrayEquals(expectedOutput,actualOutput);
    }
    @Test
    public void givenANegativeArraySortInAscendingOrder(){
        int[] expectedOutput = new int[]{-99,-66,-23,-9,-8,-7,-4};
        int[] actualOutput = sorting.sort(arr1);
        assertArrayEquals(expectedOutput,actualOutput);
    }
    @Test
    public void givenANegativeAndPositiveArraySortInAscendingOrder(){
        int[] expectedOutput = new int[]{-22,-8,-2,0,3,6,9,12,56,66};
        int[] actualOutput = sorting.sort(arr2);
        assertArrayEquals(expectedOutput,actualOutput);
    }
}
