package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] machines;
    private int size;

    public Bank() {
        this.machines = new CashMachine[0];
    }

    public void addCashMachine(CashMachine value) {
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(machines, 0, newTab, 0, machines.length);
        newTab[this.size - 1] = value;
        this.machines = newTab;
    }

    public double getBankBalance() {
        double sum = 0;
        for (int i = 0; i < machines.length; i++) {
            sum = sum + machines[i].balance();
        }
        return sum;
    }

    public double getBankBalanceFromInPayment() {
        double sum = 0;
        for (int i = 0; i < machines.length; i++) {
            sum = sum + machines[i].balanceOnlyPaymentIn();
        }
        return sum;
    }

    public double getBankBalanceFromOutPayment() {
        double sum = 0;
        for (int i = 0; i < machines.length; i++) {
            sum = sum + machines[i].balanceOnlyPaymentOut();
        }
        return sum;
    }

    public int paymentInBank() {
        int count = 0;
        for (int i = 0; i < machines.length; i++) {
            count = count + machines[i].howManyPaymentIn();
        }
        return count;
    }

    public int paymentOutBank() {
        int count = 0;
        for (int i = 0; i < machines.length; i++) {
            count = count + machines[i].howManyPaymentOut();
        }
        return count;
    }

    public double getBankAverageForAllPaymentIn() {
        double sum = getBankBalanceFromInPayment();
        return sum / paymentInBank();
    }

    public double getBankAverageForAllPaymentOut() {
        double sum = getBankBalanceFromOutPayment();
        return sum / paymentOutBank();
    }

}
