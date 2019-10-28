package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class World {

    private List<Continent> listOfContinents = new ArrayList<>();

    public void addContinent(Continent continent){
        listOfContinents.add(continent);
    }

    public boolean removeContinent(Continent continent){
        return listOfContinents.remove(continent);
    }

    public List<Continent> getListOfContinents() {
        return listOfContinents;
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal peopleQuantity = listOfContinents.stream()
                .flatMap(continent -> continent.getListOfCountriesOnContinent().stream())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.getPeopleQuantity().add(current);
        return peopleQuantity;
    }

}
