package com.jap;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

public class PhLevelAnalyserTest 
{
    PhLevelAnalyser phLevelAnalyser;

    @Before
    public void setUp()  
    {
        phLevelAnalyser = new PhLevelAnalyser();
    }

    @After
    public void tearDown()  
    {
        phLevelAnalyser = null;
    }

    @Test
    public void getPhVa1ueOfWaterForInputPhSeven() 
    {
        int phLevel = 7;
        String expectedOutput = "pH value is fine";

        String actualOutput = phLevelAnalyser.getPhValueOfWater(phLevel);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void getPhVa1ueOfWaterForInputPhEight()
    {
        int phLevel = 8;
        String expectedOutput = "pH value is fine";

        String actualOutput = phLevelAnalyser.getPhValueOfWater(phLevel);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void getPhVa1ueOfWaterForInputPhTen()
    {
        int phLevel = 10;
        String expectedOutput = "pH value is high, partial water change required";

        String actualOutput = phLevelAnalyser.getPhValueOfWater(phLevel);
        assertEquals(expectedOutput, actualOutput);
    }
}