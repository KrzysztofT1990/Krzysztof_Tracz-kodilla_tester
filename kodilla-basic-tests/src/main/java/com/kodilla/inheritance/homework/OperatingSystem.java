package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int yearPublished;

    public OperatingSystem(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public void turnOn() {
        System.out.println("System is turn ON");
    }

    public void turnOff() {
        System.out.println("System is turn OFF");
    }
}

