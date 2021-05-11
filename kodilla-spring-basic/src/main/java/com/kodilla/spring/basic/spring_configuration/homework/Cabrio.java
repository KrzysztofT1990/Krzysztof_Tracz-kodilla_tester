package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Cabrio implements Car {

    private LocalTime time;

    public Cabrio(LocalTime time) {
        this.time = time;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        if (this.time.isAfter(LocalTime.of(19, 59)) || this.time.isBefore(LocalTime.of(6, 1))) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }

}