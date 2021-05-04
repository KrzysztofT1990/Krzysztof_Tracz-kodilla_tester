package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

import static java.time.LocalTime.now;

@Component
@Scope("prototype")
public class Clock {

    public LocalTime localTime;

    public Clock() {
        this.localTime = now();
        System.out.println("Creating new clock bean..." + localTime);
    }

}
