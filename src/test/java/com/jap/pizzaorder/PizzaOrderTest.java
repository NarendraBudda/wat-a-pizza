package com.jap.pizzaorder;

import com.jap.pizzaorder.PizzaOrder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class PizzaOrderTest {
    PizzaOrder pizzaOrder;
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
        float actualResult = pizzaOrder.calculatePriceOfPizza(5,10.99f);
        assertEquals(54.95f,actualResult,0.1);

    }
    @Test
    public void givenNoOfGarlicBreadAndPriceOfGarlicBreadCalculateTotalPriceSuccess(){
        float actualResult= pizzaOrder.calculatePriceOfGarlicBread(5,5.99f);
        assertEquals(29.95f,actualResult,0.1);
    }
    @Test
    public void givenNoOfBeveragesAndPriceOfBeverageCalculateTotalPriceSuccess(){
        float actualResult = pizzaOrder.calculatePriceOfBeverage(4,1.99f);
        assertEquals(7.96f,actualResult,0.1);
    }
    @Test
    public void givenNoOfPizzaAndPriceOfPizzaCalculateTotalPriceFailure(){
        float actualResult = pizzaOrder.calculatePriceOfPizza(5,13.99f);
        assertNotEquals(48.3f,actualResult,0.1);
    }
    @Test
    public void givenNoOfGarlicBreadAndPriceOfGarlicBreadCalculateTotalPriceFailure(){
        float actualResult= pizzaOrder.calculatePriceOfGarlicBread(5,5.99f);
        assertNotEquals(56.1f,actualResult,0.1);
    }
    @Test
    public void givenNoOfBeveragesAndPriceOfBeverageCalculateTotalPriceFailure(){
        float actualResult = pizzaOrder.calculatePriceOfBeverage(4,1.99f);
        assertNotEquals(5.99f,actualResult,0.1);
    }
    @Test
    public void givenSizeofPizzaReturnPrice(){
        float actualResult = pizzaOrder.getPriceOfPizzaBasedOnSize(2);
        assertEquals(11.99f,actualResult,0.1);

    }
    @Test
    public void givenPriceOfItemsCalculateTotalBillAmount(){
        float actualResult = pizzaOrder.calculateTotalBill(54.95f,29.95f,7.96f);
        assertEquals(92.86f,actualResult,0.1);
    }

    @Test
    public void givenTotalBillAmountGreaterThan50CalculateDiscount(){
        float actualResult = pizzaOrder.calculateDiscountAndReturnBillAmount(92.86f);
        assertEquals(83.57f,actualResult,0.1);

    }
    @Test
    public void givenTotalBillLessThan50AmountCalculateDiscount(){
        float actualResult = pizzaOrder.calculateDiscountAndReturnBillAmount(48.1f);
        assertEquals(48.1f,actualResult,0.1);

    }
}
