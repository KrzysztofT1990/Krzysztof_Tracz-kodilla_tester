package com.kodilla.bank.homework;

public class CashMachine {

    private int[] transactions;
    private int size;
    private int count = 0;

    public CashMachine() {
        this.size = 0;
        this.transactions = new int[0];
    }

    public void paymentIn(int value) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = value;
        this.transactions = newTab;
        count++;
    }

    public void paymentOut(int value) {
        value *= -1;
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = value;
        this.transactions = newTab;
        count++;
    }

    public int howManyTransaction() {
        return count;
    }

    public int[] getValues() {
        return transactions;
    }

    public int balance() {
        if (this.transactions.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            sum += this.transactions[i];
        }
        return sum;
    }

    public double balanceOnlyPaymentIn() {
        if (this.transactions.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (this.transactions[i] > 0) {
                sum += this.transactions[i];
            }
        }
        return sum;
    }

    public double balanceOnlyPaymentOut() {
        if (this.transactions.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (this.transactions[i] < 0) {
                sum += this.transactions[i];
            }
        }
        return sum;
    }

}