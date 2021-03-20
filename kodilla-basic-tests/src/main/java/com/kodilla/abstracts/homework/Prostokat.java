package com.kodilla.abstracts.homework;

public class Prostokat extends Shape {

    public Prostokat(int bokA, int bokB) {
        super(bokA, bokB);
    }

    @Override
    public double PolePowierzchni(double a, double b) {
        polePowierzchni = a * b;
        return polePowierzchni;
    }

    @Override
    public double Obwód(double a, double b) {
        obwód = 2 * a + 2 * b;
        return obwód;
    }
}
