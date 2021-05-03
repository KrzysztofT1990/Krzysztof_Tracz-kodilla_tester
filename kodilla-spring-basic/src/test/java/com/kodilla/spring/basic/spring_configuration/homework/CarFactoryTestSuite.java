package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CarFactoryTestSuite {

    //Give
    private final LocalTime lightsON = LocalTime.of(23, 45);
    private final LocalTime lightsOFF = LocalTime.of(11, 15);
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
    Car car = (Car) context.getBean("carForSeason");

    @Test
    public void carSUVTest() {
        //When
        Car suv = new CarFactory().carForSeason("lato");
        assertEquals("SUV", suv.getCarType());
        assertTrue(suv.hasHeadlightsTurnedOn(lightsON));
        assertFalse(suv.hasHeadlightsTurnedOn(lightsOFF));

    }

    @Test
    public void carCabrioTest() {

    }

    @Test
    public void carSedanTest() {

    }

}