package jap.string;

import jap.string.OccurrenceOfCharacter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccurrenceOfCharacterTest {
 OccurrenceOfCharacter occurrenceOfCharacter;

 @Before
 public void setUp(){
     occurrenceOfCharacter = new OccurrenceOfCharacter();
 }

 @After
 public void tearDown(){
     occurrenceOfCharacter = null;
 }

 @Test
 public void givenStringGetCountOfCharacter(){
     String str = "counting occurrence of character with loop";
     char character = 'c';
     int expected = occurrenceOfCharacter.getCountOfCharacter(str,character);
     assertEquals(expected,6);
     String str1 = "java is a programming language";
     char character1 = 'm';
     int expected1 = occurrenceOfCharacter.getCountOfCharacter(str1,character1);
     assertEquals(expected1,2);
 }

 @Test
 public void givenStringReverseTheString(){
     String str = "Object Oriented Programming";
     String expected = occurrenceOfCharacter.reverseString(str);
     assertEquals(expected,"gnimmargorP detneirO tcejbO");
     String str1 = "java is a programming language";
     String expected1 = occurrenceOfCharacter.reverseString(str1);
     assertEquals(expected1,"egaugnal gnimmargorp a si avaj");
 }

 @Test
 public void givenStringGetLargestString(){
     String str = "Object Oriented Programming";
     String expected = occurrenceOfCharacter.getLargestString(str);
     assertEquals(expected,"Programming");
     String str1 = "counting occurrence of character with loop";
     String expected1 = occurrenceOfCharacter.getLargestString(str1);
     assertEquals(expected1,"occurrence");
 }
    @Test
    public void givenAStringGetVowelsInTheString(){
        String str = "java is a prOgramming lAnguage";
        char[] expected = occurrenceOfCharacter.getAllVowelsInTheString(str);
        char[] actual = new char[]{'a','a','i','a','O','a','i','A','u','a','e'};
        assertArrayEquals(expected,actual);
    }
    @Test
    public void givenAStringWithNoVowelsReturnNull(){
        String str = "hymns";
        char[] expected = occurrenceOfCharacter.getAllVowelsInTheString(str);
        assertEquals(expected.length,0);
    }

}