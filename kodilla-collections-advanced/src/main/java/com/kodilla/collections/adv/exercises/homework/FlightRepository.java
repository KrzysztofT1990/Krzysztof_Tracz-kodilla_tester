package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    static List<Flight> getFlightsTable() {
        List<Flight> flightsTable = new ArrayList<>();
        flightsTable.add(new Flight("Miasto-A", "Miasto-B"));
        flightsTable.add(new Flight("Miasto-C", "Miasto-B"));
        flightsTable.add(new Flight("Miasto-A", "Miasto-D"));
        flightsTable.add(new Flight("Miasto-E", "Miasto-F"));
        return flightsTable;
    }

}
