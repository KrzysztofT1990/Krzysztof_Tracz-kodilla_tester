package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    Bank bank = new Bank();
    CashMachine cashMachine1 = new CashMachine();
    CashMachine cashMachine2 = new CashMachine();
    CashMachine cashMachine3 = new CashMachine();

    public void preparation() {
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        bank.addCashMachine(cashMachine3);

        cashMachine1.paymentIn(200);
        cashMachine1.paymentIn(450);
        cashMachine1.paymentOut(200);

        cashMachine2.paymentIn(0);

        cashMachine3.paymentIn(200);
        cashMachine3.paymentOut(150);
    }

    @Test
    public void shouldShowBankBalance() {
        preparation();
        assertEquals(500, bank.getBankBalance());
    }

    @Test
    public void shouldShowThreePaymentInBank() {
        preparation();
        assertEquals(3, bank.paymentInBank());
    }

    @Test
    public void shouldShowTwoPaymentOutBank() {
        preparation();
        assertEquals(2, bank.paymentOutBank());
    }

    @Test
    public void shouldShowAveragePaymentInBank() {
        preparation();
        assertEquals(283.3, bank.getBankAverageForAllPaymentIn(),0.1);
    }

    @Test
    public void shouldShowAveragePaymentOutBank() {
        preparation();
        assertEquals(-175, bank.getBankAverageForAllPaymentOut());
    }

}
