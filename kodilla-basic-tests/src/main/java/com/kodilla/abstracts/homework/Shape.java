package com.kodilla.abstracts.homework;

public abstract class Shape {

    double polePowierzchni;
    double obwód;

    private double a;
    private double b;

    public Shape(double bokA, double bokB) {
        this.a = bokA;
        this.b = bokB;
    }

    public abstract double PolePowierzchni(double a, double b);

    public abstract double Obwód(double a, double b);

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}
