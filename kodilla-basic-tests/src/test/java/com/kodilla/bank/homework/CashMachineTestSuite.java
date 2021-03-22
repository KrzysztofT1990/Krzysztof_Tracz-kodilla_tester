package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    CashMachine cashMachine = new CashMachine();

    @Test
    public void shouldHaveZeroTransaction() {
        int[] values = cashMachine.getValues();
        assertEquals(0, values.length);
    }

    @Test
    public void shouldAddTwoTransactionIn() {
        cashMachine.paymentIn(500);
        cashMachine.paymentIn(1250);

        int[] values = cashMachine.getValues();
        assertEquals(2, values.length);
        assertEquals(500, values[0]);
        assertEquals(1250, values[1]);
    }

    @Test
    public void shouldAddTwoTransactionOut() {
        cashMachine.paymentOut(300);
        cashMachine.paymentOut(250);

        int[] values = cashMachine.getValues();
        assertEquals(2, values.length);
        assertEquals(-300, values[0]);
        assertEquals(-250, values[1]);
    }

    @Test
    public void shouldCountThreeTransation() {
        cashMachine.paymentIn(500);
        cashMachine.paymentIn(1250);
        cashMachine.paymentOut(250);

        assertEquals(3, cashMachine.howManyTransaction());
    }

    @Test
    public void shouldShowBalance() {
        cashMachine.paymentIn(500);
        cashMachine.paymentIn(1250);
        cashMachine.paymentOut(250);

        assertEquals(1500, cashMachine.balance());
    }

    @Test
    public void shouldShowBalanceOnlyIn() {
        cashMachine.paymentIn(500);
        cashMachine.paymentIn(1250);
        cashMachine.paymentOut(250);

        assertEquals(1750, cashMachine.balanceOnlyPaymentIn());
    }

    @Test
    public void shouldShowBalanceOnlyOut() {
        cashMachine.paymentIn(500);
        cashMachine.paymentIn(1250);
        cashMachine.paymentOut(250);

        assertEquals(-250, cashMachine.balanceOnlyPaymentOut());
    }

}
