package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public List<Order> getOrdersFromDateRange(LocalDate localDateStart, LocalDate localDateEnd) {
        List<Order> orderFromRange = new ArrayList<>();
        for (Order order : orders) {
            if (order.getOrderDate().isAfter(localDateStart) && order.getOrderDate().isBefore(localDateEnd)) {
                orderFromRange.add(order);
            }
        }
        return orderFromRange;
    }

    public List<Order> getOrdersFromValueRange(double minValue, double maxValue) {
        List<Order> orderValueRange = new ArrayList<>();
        for (Order order : orders) {
            if (minValue < order.getOrderValue() && maxValue > order.getOrderValue()) {
                orderValueRange.add(order);
            }
        }
        return orderValueRange;
    }

    public double getAllValueOrder() {
        double allValueOrder = 0;
        for (Order order : orders) {
            allValueOrder += order.getOrderValue();
        }
        return allValueOrder;
    }

    public int getOrderSize() {
        return orders.size();
    }

}
