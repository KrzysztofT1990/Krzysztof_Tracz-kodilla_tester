package com.kodilla.inheritance.homework;

public class Class3 extends OperatingSystem {

    public Class3(int yearPublished) {
        super(yearPublished);
    }

    @Override
    public void turnOn() {
        System.out.println("System is turn ON from Class3");
    }

    @Override
    public void turnOff() {
        System.out.println("System is turn OFF from Class3");;
    }
}
