package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {

    private int speed;
    private int incSpeed;
    private int decSpeed;

    public Ford(int speed, int incSpeed, int decSpeed) {
        this.speed = speed;
        this.incSpeed = incSpeed;
        this.decSpeed = decSpeed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + incSpeed;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - decSpeed;
    }

}
