package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        System.out.println("=================Dodawanie=====================");
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b + "\n");
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b + "\n");
        }

        System.out.println("=================Odejmowanie=====================");

        int subtractResult = calculator.subtract(a, b);
        boolean test2 = ResultChecker.assertEquals(-3, subtractResult);
        if (test2) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b + " wynik to " + subtractResult + "\n");
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b + " spodziewany wynik to: " + subtractResult + "\n");
        }

        System.out.println("==================Do=Kwadratu===================");

        int squaredResult = calculator.squared(a);
        boolean test3 = ResultChecker.assertEquals(25, squaredResult);
        if (test3) {
            System.out.println("Metoda squared działa poprawnie dla liczb " + a + " i " + b + " wynik to " + squaredResult + "\n");
        } else {
            System.out.println("Metoda squared nie działa poprawnie dla liczb " + a + " i " + b + " spodziewany wynik to: " + squaredResult + "\n");
        }

    }
}
