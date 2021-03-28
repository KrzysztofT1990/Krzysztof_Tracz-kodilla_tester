package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;

public class CarUtils {

    public static void describeCar(Car car) {
        System.out.println("\n=========" + getCarKind(car).toUpperCase() + "============");
        System.out.println("Car kind: " + getCarKind(car));
        System.out.println("Car speed: " + car.getSpeed());
    }

    private static String getCarKind(Car car) {
        if (car instanceof Opel)
            return "Opel";
        else if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Audi)
            return "Audi";
        else
            return "Unknown car kind";
    }

}
