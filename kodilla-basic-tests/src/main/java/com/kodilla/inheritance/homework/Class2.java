package com.kodilla.inheritance.homework;

public class Class2 extends OperatingSystem {

    public Class2(int yearPublished) {
        super(yearPublished);
    }

    @Override
    public void turnOn() {
        System.out.println("System is turn ON from Class2");
    }

    @Override
    public void turnOff() {
        System.out.println("System is turn OFF from Class2");
    }
}
