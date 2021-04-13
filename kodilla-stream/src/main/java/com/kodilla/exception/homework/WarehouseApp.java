package com.kodilla.exception.homework;

public class WarehouseApp {

    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("3"));
        warehouse.addOrder(new Order("4"));

        try {
            warehouse.getOrder("10");
            System.out.println("Takie zamówienie jest na liście");
        } catch (OrderDoesntExistException e) {
            System.out.println("Brak takiego numeru zamówienia");
        }

    }
}
