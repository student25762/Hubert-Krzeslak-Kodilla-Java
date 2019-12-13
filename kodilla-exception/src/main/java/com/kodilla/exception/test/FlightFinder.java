package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public boolean findFlights(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightsMap= new HashMap<>();
        flightsMap.put("Warsaw", true);
        flightsMap.put("Los Angeles", true);
        flightsMap.put("Sydney", false);
        flightsMap.put("London", true);
        if (flightsMap.containsKey(flight.getArrivalAirport())) {
            return true;
        } else {
            throw  new RouteNotFoundException("Route not found");
        }
    }
}
