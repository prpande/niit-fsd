package com.jap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortingAgeTest {

    SortingAge sortingAge ;
    @Before
    public void setUp() {
        sortingAge = new SortingAge();
    }
    @Test
    public void getDescendingArraySuccess(){
        assertArrayEquals(new int[]{33,32,31,28,26,25,24,23} ,sortingAge.getSortedAge(new int[]{23,32,24,26,33,25,31,28}) );

        assertArrayEquals(new int[]{35,34,31,30,26,22,21,20}, sortingAge.getSortedAge(new int[]{21,35,22,30,31,34,26,20}));
    }

    @After
    public void tearDown() {
        sortingAge = null;
    }
}