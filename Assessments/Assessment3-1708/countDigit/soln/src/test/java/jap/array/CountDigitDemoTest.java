package jap.array;


import jap.array.CountDigitDemo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CountDigitDemoTest {
    CountDigitDemo countDigitDemo ;

    @Before
    public void setUp(){
    countDigitDemo = new CountDigitDemo();
    }

    @After
    public void tearDown(){
        countDigitDemo = null;
    }

    @Test
    public void givenThreeDigitReturnCount(){
        int []numberArray = {123,123,234,345678,321,435};
        int expected = countDigitDemo.countDigit(numberArray);
        assertEquals(expected,5);

    }

    @Test
    public void givenThreeDigitReturnCount1(){
        int []numberArray = {123,12334,234,345678,321,435,456,678};
        int expected = countDigitDemo.countDigit(numberArray);
        assertEquals(expected,6);

    }
}