package com.kodilla.patterns.builder.pizza;

import com.kodilla.patterns.builder.bigmac.Bigmac;
import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBuildBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .setBun("sezam bun")
                .setSauce("standard")
                .setBurgers(2)
                .setIngredients("onion")
                .setIngredients("tomato")
                .setIngredients("lettuce")
                .buildBigmac();
        //When
        int howManyBurgers = bigmac.getBurgers();
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(2, howManyBurgers);
        Assert.assertEquals(3, howManyIngredients);
    }
}
