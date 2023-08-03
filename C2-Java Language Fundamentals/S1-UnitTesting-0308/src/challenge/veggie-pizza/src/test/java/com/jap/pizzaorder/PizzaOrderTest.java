package com.jap.pizzaorder;

import com.jap.pizzaorder.PizzaOrder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PizzaOrderTest 
{
    PizzaOrder pizzaOrder = null;

    @Before
    public void setUp()
    {
        //Initialize the object of class PizzaOrder
        pizzaOrder = new PizzaOrder();
    }

    @After
    public void tearDown()
    {
        // Assign object of PizzaOrder to null
        pizzaOrder = null;
    }

    // Write th logic inside the test case methods
    @Test
    public void givenNoOfPizzaAndPriceOfPizzaCalculateTotalPriceSuccess()
    {
        int noOfPizza = 10;
        float priceOfPizza = 11.0f;
        float expectedOutput = 110.0f;

        float actualOutput = pizzaOrder.calculatePriceOfPizza(noOfPizza, priceOfPizza);
        assertEquals(expectedOutput, actualOutput, 0.001f);
    }

    @Test
    public void givenNoOfGarlicBreadAndPriceOfGarlicBreadCalculateTotalPriceSuccess()
    {
        int noOfGarlicBread = 10;
        float priceOfGarlicBread = 12.0f;
        float expectedOutput = 120.0f;

        float actualOutput = pizzaOrder.calculatePriceOfGarlicBread(noOfGarlicBread, priceOfGarlicBread);
        assertEquals(expectedOutput, actualOutput, 0.001f);
    }

    @Test
    public void givenNoOfBeveragesAndPriceOfBeverageCalculateTotalPriceSuccess()
    {
        int noOfBeverages = 10;
        float priceOfBeverages = 13.0f;
        float expectedOutput = 130.0f;

        float actualOutput = pizzaOrder.calculatePriceOfBeverage(noOfBeverages, priceOfBeverages);
        assertEquals(expectedOutput, actualOutput, 0.001f);
    }

    @Test
    public void givenNoOfPizzaAndPriceOfPizzaCalculateTotalPriceFailure()
    {
        int noOfPizza = -10;
        float priceOfPizza = 11.0f;
        float expectedOutput = -1f;

        float actualOutput = pizzaOrder.calculatePriceOfPizza(noOfPizza, priceOfPizza);
        assertEquals(expectedOutput, actualOutput, 0.001f);
    }

    @Test
    public void givenNoOfGarlicBreadAndPriceOfGarlicBreadCalculateTotalPriceFailure()
    {
        int noOfGarlicBread = -10;
        float priceOfGarlicBread = 12.0f;
        float expectedOutput = -1f;

        float actualOutput = pizzaOrder.calculatePriceOfGarlicBread(noOfGarlicBread, priceOfGarlicBread);
        assertEquals(expectedOutput, actualOutput, 0.001f);
    }

    @Test
    public void givenNoOfBeveragesAndPriceOfBeverageCalculateTotalPriceFailure()
    {
        int noOfBeverages = 10;
        float priceOfBeverages = -13.0f;
        float expectedOutput = -1f;

        float actualOutput = pizzaOrder.calculatePriceOfBeverage(noOfBeverages, priceOfBeverages);
        assertEquals(expectedOutput, actualOutput, 0.001f);
    }

    @Test
    public void givenSizeofPizzaReturnPrice()
    {
        int sizeOfPizza = 2;
        float expectedOutput = 11.99f;

        float actualOutput = pizzaOrder.getPriceOfPizzaBasedOnSize(sizeOfPizza);
        assertEquals(expectedOutput, actualOutput, 0.001f);
    }

    @Test
    public void givenPriceOfItemsCalculateTotalBillAmount()
    {
        float totalPizzaPrice = 10f;
        float totalGarlicBreadPrice = 20f;
        float totalBeveragePrice = 30f;
        float expectedOutput = 60f;

        float actualOutput = pizzaOrder.calculateTotalBill(totalPizzaPrice, totalGarlicBreadPrice, totalBeveragePrice);
        assertEquals(expectedOutput, actualOutput, 0.001f);
    }

    @Test
    public void givenTotalBillAmountGreaterThan50CalculateDiscount()
    {
        float totalBillAmount = 100f;
        float expectedOutput = 90f;

        float actualOutput = pizzaOrder.calculateDiscountAndReturnBillAmount(totalBillAmount);
        assertEquals(expectedOutput, actualOutput, 0.001f);
    }

    @Test
    public void givenTotalBillLessThan50AmountCalculateDiscount()
    {
        float totalBillAmount = 20f;

        float actualOutput = pizzaOrder.calculateDiscountAndReturnBillAmount(totalBillAmount);
        assertEquals(totalBillAmount, actualOutput, 0.001f);

    }
}
