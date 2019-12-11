package com.kodilla.exception.test;

public class Application {
    public static void main(String[] args) throws RouteNotFoundException {
        FlightFinder finder = new FlightFinder();
        finder.findFlights(new Flight("Warsaw", "Peru"));
    }
}
