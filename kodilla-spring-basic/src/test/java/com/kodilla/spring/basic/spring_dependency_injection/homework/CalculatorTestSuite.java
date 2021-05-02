package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class CalculatorTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
    Calculator bean = context.getBean(Calculator.class);

    @Test
    public void addTest() {
        assertEquals(4, bean.add(2, 2));
        assertEquals(12, bean.add(2, 10));
        assertEquals(3, bean.add(5, -2));
    }

    @Test
    public void subtractTest() {
        assertEquals(0, bean.subtract(2, 2));
        assertEquals(3, bean.subtract(5, 2));
        assertEquals(-1, bean.subtract(2, 3));
    }

    @Test
    public void multiplyTest() {
        assertEquals(4, bean.multiply(2, 2));
        assertEquals(10, bean.multiply(2, 5));
        assertEquals(-6, bean.multiply(-2, 3));
    }

    @Test
    public void divideTest() {
        assertEquals(1, bean.divide(2, 2));
        assertEquals(1.5, bean.divide(3, 2));
        assertEquals(4, bean.divide(4, 1));
    }

    @Test
    public void divideTestDivideWithZero(){
        assertThrows(ArithmeticException.class,() -> bean.divide(3,0));
    }

}
