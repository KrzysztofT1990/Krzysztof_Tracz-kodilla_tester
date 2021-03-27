package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Car audi = new Audi(0, 10, 3);
        System.out.println("Audi na koniec wyścigu ma prędkość: " + showSpeed(audi));
        System.out.println("====================");

        Car ford = new Ford(0, 7, 3);
        System.out.println("Ford na koniec wyścigu ma prędkość: " + showSpeed(ford));
        System.out.println("====================");

        Car opel = new Opel(0, 8, 3);
        System.out.println("Opel na koniec wyścigu  ma prędkość: " + showSpeed(opel));
        System.out.println("====================");

    }

    private static int showSpeed(Car car) {
        int incSpeed = 0;
        int decSpeed = 0;

        while (incSpeed < 3) {
            car.increaseSpeed();
            incSpeed++;
        }

        while (decSpeed < 2) {
            car.decreaseSpeed();
            decSpeed++;
        }
        return car.getSpeed();
    }

}
