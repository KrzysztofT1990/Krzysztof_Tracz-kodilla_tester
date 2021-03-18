package com.kodilla.inheritance.homework;

public class Effect {

    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2000);
        operatingSystem.turnOn();
        operatingSystem.turnOff();
        System.out.println("=================Class2==================");

        Class2 class2 = new Class2(1990);
        class2.turnOn();
        class2.turnOff();
        System.out.println("=================Class3==================");

        Class3 class3 = new Class3(2021);
        class3.turnOn();
        class3.turnOff();
    }
}
