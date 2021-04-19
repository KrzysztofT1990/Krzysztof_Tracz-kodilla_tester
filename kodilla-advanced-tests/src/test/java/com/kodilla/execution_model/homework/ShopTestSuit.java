package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShopTestSuit {

    Shop shop = new Shop();
    Order order1 = new Order(125.5, LocalDate.of(2021, 8, 20), "Login1");
    Order order2 = new Order(50.35, LocalDate.of(2021, 7, 20), "Login2");
    Order order3 = new Order(78.15, LocalDate.of(2021, 6, 20), "Login3");
    Order order4 = new Order(328.59, LocalDate.of(2021, 5, 20), "Login4");
    Order order5 = new Order(32.19, LocalDate.of(2021, 4, 20), "Login5");

    @BeforeEach
    public void initializeShop() {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        shop.addOrder(order5);
    }

    @Test
    public void shouldAddOrdersToShop() {
        //when
        int numberOfOrder = shop.getOrderSize();
        //then
        assertEquals(5, numberOfOrder);
    }

    @Test
    public void shouldShowOrderFromDateRange() {
        //when
        List<Order> dane = shop.getOrdersFromDateRange(LocalDate.of(2021, 5, 20), LocalDate.of(2021, 7, 20));
        List<Order> expectedList = new ArrayList<>();
        expectedList.add(new Order(78.15, LocalDate.of(2021, 6, 20), "Login3"));
        //then
        assertEquals(expectedList, dane);
    }

    @Test
    public void shouldShowOrderFromValueRange() {
        //when
        List<Order> dane = shop.getOrdersFromValueRange(50, 100);
        List<Order> expectedList = new ArrayList<>();
        expectedList.add(new Order(50.35, LocalDate.of(2021, 7, 20), "Login2"));
        expectedList.add(new Order(78.15, LocalDate.of(2021, 6, 20), "Login3"));
        //then
        assertEquals(expectedList, dane);
    }

    @Test
    public void shouldShowSumAllValueOrders(){
        //when
        double sumAllValue = shop.getAllValueOrder();
        //then
        assertEquals(614.78,sumAllValue);
    }
}
 