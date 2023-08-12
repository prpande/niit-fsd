package com.jap.pizzaorder;

import com.jap.pizzaorder.PizzaOrder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class PizzaOrderTest {
    PizzaOrder pizzaOrder = null;
    @Before
    public void setUp(){
        //Initialize the object of class PizzaOrder
        pizzaOrder = new PizzaOrder();
    }
    @After
    public void tearDown(){
        // Assign object of PizzaOrder to null
        pizzaOrder = null;
    }

    // Write th logic inside the test case methods
    @Test
    public void givenNoOfPizzaAndPriceOfPizzaCalculateTotalPriceSuccess(){

    }
    @Test
    public void givenNoOfGarlicBreadAndPriceOfGarlicBreadCalculateTotalPriceSuccess(){

    }
    @Test
    public void givenNoOfBeveragesAndPriceOfBeverageCalculateTotalPriceSuccess(){

    }
    @Test
    public void givenNoOfPizzaAndPriceOfPizzaCalculateTotalPriceFailure(){

    }
    @Test
    public void givenNoOfGarlicBreadAndPriceOfGarlicBreadCalculateTotalPriceFailure(){

    }
    @Test
    public void givenNoOfBeveragesAndPriceOfBeverageCalculateTotalPriceFailure(){

    }
    @Test
    public void givenSizeofPizzaReturnPrice(){


    }
    @Test
    public void givenPriceOfItemsCalculateTotalBillAmount(){

    }

    @Test
    public void givenTotalBillAmountGreaterThan50CalculateDiscount(){


    }
    @Test
    public void givenTotalBillLessThan50AmountCalculateDiscount(){


    }
}
