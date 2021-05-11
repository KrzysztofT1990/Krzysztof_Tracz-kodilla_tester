package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
class CarFactoryTestSuite {

    @Mock
    private Time time;

    @InjectMocks
    private CarFactory factory;

    @Test
    public void carSUVTestlightsOn() {
        when(time.getLocalDate()).thenReturn(LocalDate.of(2021, 1, 6));
        when(time.getLocalTime()).thenReturn(LocalTime.of(23, 45));
        Car car = factory.carForSeason();
        Assertions.assertTrue(car instanceof SUV);
        Assertions.assertTrue(car.hasHeadlightsTurnedOn());
    }

    @Test
    public void carSUVTestLightsOff() {
        when(time.getLocalDate()).thenReturn(LocalDate.of(2021, 1, 6));
        when(time.getLocalTime()).thenReturn(LocalTime.of(11, 45));
        Car car = factory.carForSeason();
        Assertions.assertTrue(car instanceof SUV);
        Assertions.assertFalse(car.hasHeadlightsTurnedOn());
    }

    @Test
    public void carCabrioTestLightsOn() {
        when(time.getLocalDate()).thenReturn(LocalDate.of(2021, 7, 6));
        when(time.getLocalTime()).thenReturn(LocalTime.of(23, 45));
        Car car = factory.carForSeason();
        Assertions.assertTrue(car instanceof Cabrio);
        Assertions.assertTrue(car.hasHeadlightsTurnedOn());
    }

    @Test
    public void carCabrioTestLightsOff() {
        when(time.getLocalDate()).thenReturn(LocalDate.of(2021, 7, 6));
        when(time.getLocalTime()).thenReturn(LocalTime.of(11, 45));
        Car car = factory.carForSeason();
        Assertions.assertTrue(car instanceof Cabrio);
        Assertions.assertFalse(car.hasHeadlightsTurnedOn());
    }

    @Test
    public void carSedanTestLightsOn() {
        when(time.getLocalDate()).thenReturn(LocalDate.of(2021, 5, 6));
        when(time.getLocalTime()).thenReturn(LocalTime.of(23, 45));
        Car car = factory.carForSeason();
        Assertions.assertTrue(car instanceof Sedan);
        Assertions.assertTrue(car.hasHeadlightsTurnedOn());
    }

    @Test
    public void carSedanTestLightsOff() {
        when(time.getLocalDate()).thenReturn(LocalDate.of(2021, 5, 6));
        when(time.getLocalTime()).thenReturn(LocalTime.of(11, 45));
        Car car = factory.carForSeason();
        Assertions.assertTrue(car instanceof Sedan);
        Assertions.assertFalse(car.hasHeadlightsTurnedOn());
    }

}
