package com.kodilla.exception.test;

public class Application {
    public static void main(String[] args) {
        try {
            FlightFinder finder = new FlightFinder();
            System.out.println(finder.findFlights(new Flight("Paris", "Lima")));
        } catch (RouteNotFoundException e) {
            System.out.println("Route not found");
        }
    }
}
