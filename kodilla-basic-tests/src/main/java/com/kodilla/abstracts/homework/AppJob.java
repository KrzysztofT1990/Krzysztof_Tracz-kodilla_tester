package com.kodilla.abstracts.homework;

public class AppJob {

    public static void main(String[] args) {

        PersonResponsibilities process = new PersonResponsibilities();

        Person tomek = new Person("Tomasz", 30, "Programista");
        Programmer programmer = new Programmer();
        System.out.println(tomek.firstName + " jest na stanowisku: " + tomek.job + " o wynagrodzeniu " + programmer.salary);
        process.process(programmer);

        System.out.println("===============================================");

        Person ania = new Person("Ania", 23, "Kucharz");
        Cook cook = new Cook();
        System.out.println(ania.firstName + " jest na stanowisku: " + ania.job + " o wynagrodzeniu " + cook.salary);
        process.process(cook);

    }
}
