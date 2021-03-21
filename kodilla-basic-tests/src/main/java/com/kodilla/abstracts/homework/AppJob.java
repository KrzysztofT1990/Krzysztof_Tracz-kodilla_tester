package com.kodilla.abstracts.homework;

public class AppJob {

    public static void main(String[] args) {

        PersonResponsibilities process = new PersonResponsibilities();

        Programmer programmer = new Programmer();
        Person tomek = new Person("Tomasz", 30, programmer);
        System.out.println(tomek.firstName + " jest na stanowisku: " + programmer.name + " o wynagrodzeniu " + programmer.salary);
        process.process(programmer);

        System.out.println("===============================================");

        Cook cook = new Cook();
        Person ania = new Person("Ania", 23, cook);
        System.out.println(ania.firstName + " jest na stanowisku: " + cook.name + " o wynagrodzeniu " + cook.salary);
        process.process(cook);

    }
}
