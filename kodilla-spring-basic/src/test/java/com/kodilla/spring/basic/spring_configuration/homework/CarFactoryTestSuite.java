package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
class CarFactoryTestSuite {

    //Give
    private final LocalTime lightsON = LocalTime.of(23, 45);
    private final LocalTime lightsOFF = LocalTime.of(11, 15);
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
    Car car = (Car) context.getBean("carForSeason");

    @InjectMocks
    private Time time;


    @Test
    public void carSUVTest(@Mock LocalTime time) {
        //When



    }

    @Test
    public void carCabrioTest() {

    }

    @Test
    public void carSedanTest() {

    }

}
