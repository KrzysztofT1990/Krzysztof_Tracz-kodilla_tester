package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    public void testIsOrderInList() throws OrderDoesntExistException {
        //give
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        //when
        //then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("2"));
    }
}
