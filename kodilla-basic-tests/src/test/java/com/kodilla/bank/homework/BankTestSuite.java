package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    Bank bank = new Bank();

    @Test
    public void shouldShowBankBalance() {
        bank.paymentInBank1(200);
        bank.paymentInBank1(450);
        bank.paymentOutBank1(200);

        bank.paymentInBank2(0);

        bank.paymentInBank3(200);
        bank.paymentOutBank3(150);

        assertEquals(500, bank.getBankBalance());
    }

    @Test
    public void shouldShowThreePaymentInBank() {
        bank.paymentInBank1(200);
        bank.paymentInBank1(450);
        bank.paymentOutBank1(200);

        bank.paymentInBank2(0);

        bank.paymentInBank3(200);
        bank.paymentOutBank3(150);

        assertEquals(3, bank.howManyTransactionInBank());
    }

    @Test
    public void shouldShowTwoPaymentOutBank() {
        bank.paymentInBank1(200);
        bank.paymentInBank1(450);
        bank.paymentOutBank1(200);

        bank.paymentInBank2(0);

        bank.paymentInBank3(200);
        bank.paymentOutBank3(150);

        assertEquals(2, bank.howManyTransactionOutBank());
    }

    @Test
    public void shouldShowAveragePaymentInBank() {
        bank.paymentInBank1(250);
        bank.paymentInBank1(450);
        bank.paymentOutBank1(200);

        bank.paymentInBank2(0);

        bank.paymentInBank3(200);
        bank.paymentOutBank3(400);

        assertEquals(300, bank.getBankAverageForAllPaymentIn());
    }

    @Test
    public void shouldShowAveragePaymentOutBank() {
        bank.paymentInBank1(250);
        bank.paymentInBank1(450);
        bank.paymentOutBank1(600);

        bank.paymentInBank2(0);

        bank.paymentInBank3(200);
        bank.paymentOutBank3(400);

        assertEquals(-500, bank.getBankAverageForAllPaymentOut());
    }

}
