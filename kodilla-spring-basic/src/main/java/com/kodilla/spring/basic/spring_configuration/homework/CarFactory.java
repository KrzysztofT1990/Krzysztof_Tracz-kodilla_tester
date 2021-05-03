package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarFactory {

    @Bean
    public Car carForSeason(String poraRoku) {
        Car car = null;

        switch (poraRoku) {
            case "lato":
                car = new Cabrio();
                break;
            case "zima":
                car = new SUV();
                break;
            case "wiosna":
            case "jesien":
                car = new Sedan();
                break;
            default:
                System.out.println("podano złą porę roku.");
                break;
        }
        return car;
    }

}

