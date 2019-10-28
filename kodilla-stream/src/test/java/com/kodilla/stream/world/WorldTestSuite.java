package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        //Create 3 continents
        Continent europe = new Continent("Europe");
        Continent africa = new Continent("Africa");
        Continent asia = new Continent("Asia");

        //When
        europe.addCountry(new Country("Poland", new BigDecimal("38")));
        europe.addCountry(new Country("Germany", new BigDecimal("82")));
        europe.addCountry(new Country("Spain", new BigDecimal("55")));
        europe.addCountry(new Country("France", new BigDecimal("67")));

        africa.addCountry(new Country("Nigeria", new BigDecimal("190")));
        africa.addCountry(new Country("Egypt", new BigDecimal("97")));
        africa.addCountry(new Country("Sudan", new BigDecimal("40")));
        africa.addCountry(new Country("Ethiopia", new BigDecimal("105")));

        asia.addCountry(new Country("China", new BigDecimal("1382")));
        asia.addCountry(new Country("India", new BigDecimal("1339")));

        World world = new World();
        world.addContinent(europe);
        world.addContinent(africa);
        world.addContinent(asia);

        //Then
        BigDecimal expectedTotalPopulation = new BigDecimal("3395");
        Assert.assertEquals(3, world.getListOfContinents().size());
        Assert.assertEquals(expectedTotalPopulation, world.getPeopleQuantity());

    }
}
