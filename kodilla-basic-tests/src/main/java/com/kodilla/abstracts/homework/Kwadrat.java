package com.kodilla.abstracts.homework;

public class Kwadrat extends Shape {

    public Kwadrat(double bokA, double bokB) {
        super(bokA, bokB);
    }

    @Override
    public double PolePowierzchni(double a, double b) {
        polePowierzchni = a * a;
        return polePowierzchni;
    }

    @Override
    public double Obwód(double a, double b) {
        obwód = 4 * a;
        return obwód;
    }
}
