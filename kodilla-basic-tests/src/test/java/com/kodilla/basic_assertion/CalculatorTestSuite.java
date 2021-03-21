package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        int subtractResult = calculator.subtract(a, b);
        assertEquals(-3, subtractResult);
    }

    @Test
    public void testSquared() {
        Calculator calculator = new Calculator();
        int[] tab = {-3, 0, 5};

        for (int j : tab) {
            int squaredResult = calculator.squared(j);

            if (j < 0) {
                assertEquals(9, squaredResult);
            } else if (j == 0) {
                assertEquals(0, squaredResult);
            } else {
                assertEquals(25, squaredResult);
            }
        }
    }
}
