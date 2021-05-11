package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class Time {

    private LocalDate localDate;

    private LocalTime localTime;

    public Time() {
        this.localDate = LocalDate.now();
        this.localTime = LocalTime.now();
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

}
