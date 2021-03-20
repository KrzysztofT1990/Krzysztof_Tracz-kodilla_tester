package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {

        Prostokat prostokat = new Prostokat(3, 4);
        System.out.print("Obwód Prostokąta to: ");
        System.out.println(prostokat.Obwód(prostokat.getA(), prostokat.getB()));
        System.out.print("Pole Prostokąta to: ");
        System.out.println(prostokat.PolePowierzchni(prostokat.getA(), prostokat.getB()));
        System.out.println("======================");

        Kwadrat kwadrat = new Kwadrat(5, 0);
        System.out.print("Obwód Kwadratu to: ");
        System.out.println(kwadrat.Obwód(kwadrat.getA(), kwadrat.getB()));
        System.out.print("Pole Kwadratu to: ");
        System.out.println(kwadrat.PolePowierzchni(kwadrat.getA(), kwadrat.getB()));
        System.out.println("======================");

        Kolo kolo = new Kolo(3,0);
        System.out.print("Obwód Koła to: ");
        System.out.println(kolo.Obwód(kolo.getA(), kolo.getB()));
        System.out.print("Pole Koła to: ");
        System.out.println(kolo.PolePowierzchni(kolo.getA(), kolo.getB()));
        System.out.println("======================");
    }
}

