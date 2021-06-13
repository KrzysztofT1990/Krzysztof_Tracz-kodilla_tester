package com.kodilla.jacoco;

public class Year {
    int yearCheck;

    public Year(int year) {
        this.yearCheck = year;
    }

    public boolean isLeap() {
        if (this.yearCheck % 4 == 0) {
            if (this.yearCheck % 100 == 0) {
                return this.yearCheck % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}