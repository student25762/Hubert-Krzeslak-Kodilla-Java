package com.kodilla.patterns.factory;

import org.junit.Assert;
import org.junit.Test;

public class ShapeFactoryTestSuite {
    @Test
    public void testFactoryCircle(){
        //Given
        ShapeFactory shapeFactory = new ShapeFactory();
        //When
        Shape circle = shapeFactory.makeShape(ShapeFactory.CIRCLE);
        //Then
        Assert.assertEquals(Math.PI * Math.pow(4.5, 2.0), circle.getArea(), 0);
        Assert.assertEquals("The rounded circle",  circle.getName());
    }
}
