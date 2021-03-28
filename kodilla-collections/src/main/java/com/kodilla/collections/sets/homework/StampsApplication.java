package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {

    public static void main(String[] args) {

        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Znaczek_Nr_1", 5.5, 5.0, true));
        stamps.add(new Stamp("Znaczek_Nr_2", 5.5, 5.0, true));
        stamps.add(new Stamp("Znaczek_Nr_3", 5.5, 5.0, true));
        stamps.add(new Stamp("Znaczek_Nr_1", 5.5, 5.0, true)); //duplikat
        stamps.add(new Stamp("Znaczek_Nr_4", 5.5, 5.0, true));
        stamps.add(new Stamp("Znaczek_Nr_4", 5.5, 5.0, true)); //duplikat
        stamps.add(new Stamp("Znaczek_Nr_5", 5.5, 5.0, true));
        stamps.add(new Stamp("Znaczek_Nr_6", 5.5, 5.0, true));
        stamps.add(new Stamp("Znaczek_Nr_7", 5.5, 5.0, true));
        stamps.add(new Stamp("Znaczek_Nr_3", 5.5, 5.0, true)); //duplikat
        stamps.add(new Stamp("Znaczek_Nr_3", 5.5, 5.0, false));

        System.out.println("\nIlość niepowtarzalnych znaczków w kolekcji to: " + stamps.size() + "\n");
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
