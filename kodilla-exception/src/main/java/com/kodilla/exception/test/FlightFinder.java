package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public boolean findFlights(Flight flight) throws RouteNotFoundException {
        Map<Flight, Boolean> flights = new HashMap<Flight, Boolean>();
        Flight flight1 = new Flight("Warsaw", "Mexico");
        Flight flight2 = new Flight("Los Angeles", "Sydney");
        flights.put(flight1, true);
        flights.put(flight2, true);
        if(flights.containsValue(true)){
            return true;
        } else return false;
    }
}
