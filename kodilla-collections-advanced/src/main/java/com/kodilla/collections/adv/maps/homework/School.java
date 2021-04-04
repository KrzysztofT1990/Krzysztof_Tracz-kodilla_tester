package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Integer> pupils = new ArrayList<>();
    private String schoolName;

    public School(String schoolName, int... klasy) {
        this.schoolName = schoolName;
        for (int uczniowie : klasy)
            this.pupils.add(uczniowie);
    }

    public int getAllPupilsFromSchool() {
        int sum = 0;
        for (int pupil : pupils)
            sum += pupil;
        return sum;
    }

    @Override
    public String toString() {
        return "School Name: " + this.schoolName;
    }
}
