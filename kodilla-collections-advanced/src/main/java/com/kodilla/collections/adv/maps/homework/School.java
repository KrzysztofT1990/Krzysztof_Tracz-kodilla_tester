package com.kodilla.collections.adv.maps.homework;

import javax.lang.model.element.Name;
import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Integer> pupils = new ArrayList<>();

    public School(int... klasy) {
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
        return "School Name: " + "!!tu ma być nazwa!! ";
    }
}
