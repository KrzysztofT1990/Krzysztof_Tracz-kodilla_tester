package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {

    public static void main(String[] args) {
        Map<Principal, School> xxx = new HashMap<>();

        Principal dyrektor1 = new Principal("ImięDyrektora1", "NazwiskoDyrektora1");
        Principal dyrektor2 = new Principal("ImięDyrektora2", "NazwiskoDyrektora2");
        Principal dyrektor3 = new Principal("ImięDyrektora3", "NazwiskoDyrektora3");

        School szkola1 = new School("NazwaSzkoły1", 20, 35, 15, 30);
        School szkola2 = new School("NazwaSzkoły2", 5, 10, 15, 20);
        School szkola3 = new School("NazwaSzkoły3", 10, 10, 10, 10);

        xxx.put(dyrektor1, szkola1);
        xxx.put(dyrektor2, szkola2);
        xxx.put(dyrektor3, szkola3);

        for (Map.Entry<Principal, School> principalSchoolEntry : xxx.entrySet())
            System.out.println(principalSchoolEntry.getKey().getFirstname() + " " + principalSchoolEntry.getKey().getLastname() +
                    " będzie kierować: " + principalSchoolEntry.getValue() + " gdzie w sumie jest uczniów: " +
                    principalSchoolEntry.getValue().getAllPupilsFromSchool());
    }
}
