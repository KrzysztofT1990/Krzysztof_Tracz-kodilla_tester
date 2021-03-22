package com.kodilla.bank.homework;

public class Bank {

    private CashMachine bankomat1;
    private CashMachine bankomat2;
    private CashMachine bankomat3;
    private int countIn;
    private int countOut;

    public Bank() {
        this.bankomat1 = new CashMachine();
        this.bankomat2 = new CashMachine();
        this.bankomat3 = new CashMachine();
    }

    public double getBankBalance() {
        double sum = this.bankomat1.balance() + this.bankomat2.balance() + this.bankomat3.balance();
        return sum;
    }

    public void paymentInBank1(int value) {
        this.bankomat1.paymentIn(value);
        if (value != 0) {
            countIn++;
        }
    }

    public void paymentOutBank1(int value) {
        this.bankomat1.paymentOut(value);
        if (value != 0) {
            countOut++;
        }
    }

    public void paymentInBank2(int value) {
        this.bankomat2.paymentIn(value);
        if (value != 0) {
            countIn++;
        }
    }

    public void paymentOutBank2(int value) {
        this.bankomat2.paymentOut(value);
        if (value != 0) {
            countOut++;
        }
    }

    public void paymentInBank3(int value) {
        this.bankomat3.paymentIn(value);
        if (value != 0) {
            countIn++;
        }
    }

    public void paymentOutBank3(int value) {
        this.bankomat3.paymentOut(value);
        if (value != 0) {
            countOut++;
        }
    }

    public int howManyTransactionInBank() {
        return countIn;
    }

    public int howManyTransactionOutBank() {
        return countOut;
    }

    public double getBankAverageForAllPaymentIn() {
        double sum = this.bankomat1.balanceOnlyPaymentIn() + this.bankomat2.balanceOnlyPaymentIn() + this.bankomat3.balanceOnlyPaymentIn();
        return sum / howManyTransactionInBank();
    }

    public double getBankAverageForAllPaymentOut() {
        double sum = this.bankomat1.balanceOnlyPaymentOut() + this.bankomat2.balanceOnlyPaymentOut() + this.bankomat3.balanceOnlyPaymentOut();
        return sum / howManyTransactionOutBank();
    }

}
