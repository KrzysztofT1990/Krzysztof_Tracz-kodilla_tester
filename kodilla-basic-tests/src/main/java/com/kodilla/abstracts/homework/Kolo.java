package com.kodilla.abstracts.homework;

public class Kolo extends Shape {

    private double pi = 3.14;

    public Kolo(double bokR, double bokD) {
        super(bokR, 0);
    }

    @Override
    public double PolePowierzchni(double r, double d) {
        polePowierzchni = pi * (r * r);
        return polePowierzchni;
    }

    @Override
    public double Obwód(double r, double d) {
        obwód = 2 * 3.14 * r;
        return obwód;
    }
}
