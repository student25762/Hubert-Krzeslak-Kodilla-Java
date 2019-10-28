package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {

    private BigDecimal peopleQuantity;
    private String countryName;

    public Country(String countryName, BigDecimal peopleQuantity){
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantity(){
        return peopleQuantity;
    }

}
