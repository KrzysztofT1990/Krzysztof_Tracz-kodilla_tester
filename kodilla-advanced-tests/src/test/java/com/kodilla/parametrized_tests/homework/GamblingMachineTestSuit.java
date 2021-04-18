package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuit {

    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/invalidSetOfNumbers.csv", numLinesToSkip = 1)
    public void shouldThrowExceptionWithThisSetNumber(int num1, int num2, int num3, int num4, int num5, int num6) {
        //give
        Set<Integer> test = new HashSet<>();
        test.add(num1);
        test.add(num2);
        test.add(num3);
        test.add(num4);
        test.add(num5);
        test.add(num6);
        //when
        //than
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(test));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/invalidSetOfNumbersBecauseToShort.csv", numLinesToSkip = 1)
    public void shouldThrowExceptionWithThisSetNumber(int num1, int num2, int num3, int num4) {
        //give
        Set<Integer> test = new HashSet<>();
        test.add(num1);
        test.add(num2);
        test.add(num3);
        test.add(num4);
        //when
        //than
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(test));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/invalidSetOfNumbersBecauseToLong.csv", numLinesToSkip = 1)
    public void shouldThrowExceptionWithThisSetNumber(int num1, int num2, int num3, int num4, int num5, int num6, int num7) {
        //give
        Set<Integer> test = new HashSet<>();
        test.add(num1);
        test.add(num2);
        test.add(num3);
        test.add(num4);
        test.add(num5);
        test.add(num6);
        test.add(num7);
        //when
        //than
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(test));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/corectSetOfNumbers.csv", numLinesToSkip = 1)
    public void shouldDontThrowExceptionWithThisSetNumber(int num1, int num2, int num3, int num4, int num5, int num6) throws InvalidNumbersException {
        //give
        Set<Integer> test = new HashSet<>();
        test.add(num1);
        test.add(num2);
        test.add(num3);
        test.add(num4);
        test.add(num5);
        test.add(num6);
        //when
        int expected = gamblingMachine.howManyWins(test);
        //than
        assertTrue (expected >=0 && expected <= 6);
    }

}
