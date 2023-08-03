package org.example.hellomaven;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    App obj = new App();
    
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
	public void shouldGiveCorrectValueForPositiveInput()
	{
		//Triple A's
		//arrange--arranging input and expected output(setup the test data)
		int firstNumber=100;
		int secondNumber=200;
		int expectedResult=300;

		//act--we call the method to be tested
		int actualResult=obj.add(firstNumber,secondNumber);

		//assertion--verify the actualResult is same as we expected
		//assertEquals method to check whether expectedResult and actualResult are equal
		assertEquals(expectedResult,actualResult);
	}

	@Test
	public void shouldGiveCorrectValueForNegativeInput()
	{
		//arrange
		int firstNumber=-100;
		int secondNumber=-200;
		int expectedResult=-300;
		//act
		int actualResult= obj.add(firstNumber,secondNumber);
		//assertion
		assertEquals(expectedResult,actualResult);
	}

	@Test
	public void shouldGiveCorrectValueForLargeInput()
	{
		//arrange
		int firstNumber=100000;
		int secondNumber=100000;
		int expectedResult=200000;
		//act
		int actualResult =obj.add(firstNumber,secondNumber);
		//assert
		assertEquals(expectedResult,actualResult);
	}

	@Test
	public void shouldGiveCorrectValueForPosNegInput()
	{
		//arrange
		int firstNumber=500;
		int secondNumber=-500;
		int expectedResult=0;
		//act
		int actualResult =obj.add(firstNumber,secondNumber);
		//assert
		assertEquals(expectedResult,actualResult);
	}

	@Test
	public void div()
	{
		//arrange
		double num=100.0;
		double divisor=10.0;
		double expectedResult=10.0;
		//act
		double actualResult=obj.divide(num,divisor);
		//assert
		assertEquals(expectedResult,actualResult,0.00); //delta or epsilon value
	}

	@Test
	public void improperDiv()
	{
		//arrange
		double num=100.0;
		double divisor=3.0;
		double expectedResult=33.3333333333;
		//act
		double actualResult=obj.divide(num,divisor);
		//assert
		assertEquals(expectedResult,actualResult,0.1); //delta or epsilon value
	}

	@Test
	public void chkEvn()
	{
		//arrange
		int num=40;
		boolean expectedResult=true;
		//act
		boolean actualResult=obj.isEven(num);
		//assert
		assertEquals(expectedResult,actualResult);
	}
}
