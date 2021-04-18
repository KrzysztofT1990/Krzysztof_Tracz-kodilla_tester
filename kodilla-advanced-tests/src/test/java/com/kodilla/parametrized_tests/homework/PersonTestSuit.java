package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuit {

    static Stream<Arguments> provideWeightAndHeightForTesting() {
        return Stream.of(
                Arguments.of("Very severely underweight", 1.72, 10),
                Arguments.of("Severely underweight", 1.72, 45),
                Arguments.of("Underweight", 1.72, 50),
                Arguments.of("Normal (healthy weight)", 1.72, 60),
                Arguments.of("Overweight", 1.72, 80),
                Arguments.of("Obese Class I (Moderately obese)", 1.72, 90),
                Arguments.of("Obese Class II (Severely obese)", 1.72, 110),
                Arguments.of("Obese Class III (Very severely obese)", 1.72, 120),
                Arguments.of("Obese Class IV (Morbidly Obese)", 1.72, 140),
                Arguments.of("Obese Class V (Super Obese)", 1.72, 150),
                Arguments.of("Obese Class VI (Hyper Obese)", 1.72, 200)
        );
    }

}
