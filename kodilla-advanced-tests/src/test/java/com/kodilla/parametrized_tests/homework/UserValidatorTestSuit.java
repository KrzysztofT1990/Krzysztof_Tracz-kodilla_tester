package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuit {

    UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"abcdef", "12345", "ABC", "-._", "Ab2-._"})
    public void shouldReturnTrueForValidateUser(String userName) {
        boolean result = userValidator.validateUsername(userName);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"ab", "45", "AC", "-!_", "Ab2-._!", "", "   "})
    public void shouldReturnFalseForValidateUser(String userName) {
        boolean result = userValidator.validateUsername(userName);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"_a1A-@0Za.a", "_a1A-@0Za.abcdef", "-@5.fg"})
    public void shouldReturnTrueForvalidateEmail(String userName) {
        boolean result = userValidator.validateEmail(userName);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"_a!1A-@0Za.a", "_a@A-@0Za.a", "_a 1.A-@0Za.a", "_a1A-@0_Za.a", "_a1A-@0Za.a3", "_a1A-@0Za.adwerfd", "  _a1A-0Za.a  "})
    public void shouldReturnFalseForvalidateEmail(String userName) {
        boolean result = userValidator.validateEmail(userName);
        assertFalse(result);
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseForNullEmaisl(String userName) {
        assertFalse(userValidator.validateEmail(userName));
    }

}
