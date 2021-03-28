package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Audi(10, 0, 3));
        Audi audiForTest = new Audi(15, 0, 3);
        cars.add(audiForTest);
        cars.add(new Ford(7, 0, 3));
        cars.add(new Ford(9, 0, 3));
        cars.add(new Opel(8, 0, 3));
        cars.add(new Opel(11, 0, 3));

        System.out.println("\n========ArrayListOfCars===========");
        System.out.println("Aktualna lista aut to: " + cars.size());
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }

        System.out.println("\n========ArrayListOfCarsAfterDelFromIndex===========");
        cars.remove(4);
        cars.remove(2);
        cars.remove(0);

        System.out.println("Aktualna lista aut to: " + cars.size());
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }

        System.out.println("\n========ArrayListOfCarsAfterDelFromObject===========");
        cars.remove(audiForTest);

        System.out.println("Aktualna lista aut to: " + cars.size());
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }

    }

}
