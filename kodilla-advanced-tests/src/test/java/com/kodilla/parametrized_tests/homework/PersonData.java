package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonData {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonTestSuit#provideWeightAndHeightForTesting")
    public void shouldSchowCorrectInfo(String nameBMI, double height, double weight) {
        Person person = new Person(height,weight);
        assertEquals(nameBMI,person.getBMI());
    }

}
