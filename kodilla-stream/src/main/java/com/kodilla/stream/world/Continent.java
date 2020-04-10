package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Continent {


    private String continentName;
    private List<Country> listOfCountriesOnContinent = new ArrayList<>();


    public List<Country> getListOfCountriesOnContinent() {
        return listOfCountriesOnContinent;
    }

    public void addCountry(Country country) {
        listOfCountriesOnContinent.add(country);
    }

    public boolean removeCountry(Country country) {
        return listOfCountriesOnContinent.remove(country);
    }

    public Continent(String continentName) {
        this.continentName = continentName;
    }


}
