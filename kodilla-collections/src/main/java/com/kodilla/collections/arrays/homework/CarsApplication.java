package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;

import java.util.Random;


public class CarsApplication {

    public static void main(String[] args) {
        Random random = new Random();

        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        Random random = new Random();

        int drawCarKind = random.nextInt(3);
        int speed = random.nextInt(20) + 4;
        if (drawCarKind == 0)
            return new Opel(speed, 0, 3);
        else if (drawCarKind == 1)
            return new Ford(speed, 0, 3);
        else
            return new Audi(speed, 0, 3);
    }

}
