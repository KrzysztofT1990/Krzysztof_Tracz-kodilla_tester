package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {

    @Test
    public void testFindFlightsFrom() {
        //give
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> result = flightFinder.findFlightsFrom("Miasto-A");
        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Miasto-A", "Miasto-B"));
        expectedList.add(new Flight("Miasto-A", "Miasto-D"));
        assertEquals(result, expectedList);
    }

    @Test
    public void testFindFlightsTo() {
        //give
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> result = flightFinder.findFlightsTo("Miasto-B");
        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Miasto-A", "Miasto-B"));
        expectedList.add(new Flight("Miasto-C", "Miasto-B"));
        assertEquals(result, expectedList);
    }

}