package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    CashMachine cashMachine = new CashMachine();

    @Test
    public void shouldHaveZeroTransaction() {
        assertEquals(0, cashMachine.howManyTransaction());
    }

    @Test
    public void shouldAddTwoTransactionIn() {
        cashMachine.paymentIn(500);
        cashMachine.paymentIn(1250);

        assertEquals(2, cashMachine.howManyTransaction());
    }

    @Test
    public void shouldAddTwoTransactionOut() {
        cashMachine.paymentOut(300);
        cashMachine.paymentOut(250);

        assertEquals(2, cashMachine.howManyTransaction());
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
