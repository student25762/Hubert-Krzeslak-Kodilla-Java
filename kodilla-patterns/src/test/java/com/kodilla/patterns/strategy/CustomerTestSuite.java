package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.predictors.AggressivePredictor;
import org.junit.Assert;
import org.junit.Test;

public class CustomerTestSuite {
    @Test
    public void testDefaultInvestStrategy(){
        //Given
        Customer steven = new IndividualCustomer("Steven Morse");
        Customer john = new IndividualYoungCustomer("John Jobs");
        Customer kodilla = new CorporateCustomer("Kodilla");

        //When
        String stevenShouldBuy = steven.predict();
        System.out.println("Steven should buy " + stevenShouldBuy);
        String johnShouldBuy = john.predict();
        System.out.println("John should buy " + johnShouldBuy);
        String kodillaShouldBuy = kodilla.predict();
        System.out.println("Kodilla should buy " + kodillaShouldBuy);

        //Then
        Assert.assertEquals("[Conservative Predictor] Buy debentures of XYZ", stevenShouldBuy);
        Assert.assertEquals("[Balanced Predictor] Buy shared units of XYZ", kodillaShouldBuy);
        Assert.assertEquals("[Aggressive Predictor] Buy stock of XYZ", johnShouldBuy);

    }

    @Test
    public void testIndividualStrategy(){
        //Given
        Customer john = new IndividualYoungCustomer("John Morse");

        //When
        john.setBuyingStrategy(new AggressivePredictor());
        String johnShouldBuy = john.predict();

        //Then
        Assert.assertEquals("[Aggressive Predictor] Buy stock of XYZ", johnShouldBuy);
    }
}
