package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    private Display display;

    public double add(double a, double b) {
        double result = a + b;
        return display.display(result);
    }

    public double subtract(double a, double b) {
        double result = a - b;
        return display.display(result);
    }

    public double multiply(double a, double b) {
        double result = a * b;
        return display.display(result);
    }

    public double divide(double a, double b) {
        if (b != 0){
            double result = a / b;
            return display.display(result);
        }
        throw new ArithmeticException("Nie można dzielić przez 0");
    }

}
