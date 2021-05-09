package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class CarFactory {

    @Autowired
    private Time time;

    @Bean
    public Car carForSeason() {
        Car car = null;
        LocalDate date = time.getLocalDate();

        if (date.getDayOfYear() >= 172 && date.getDayOfYear() <= 266) {
            car = new Cabrio();
        } else if (date.getDayOfYear() >= 343 || date.getDayOfYear() <= 80) {
            car = new SUV();
        } else {
            car = new Sedan();
        }
        return car;
    }

}
