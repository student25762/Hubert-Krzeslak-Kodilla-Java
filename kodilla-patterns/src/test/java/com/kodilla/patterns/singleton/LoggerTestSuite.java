package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testLastLog(){
        //Given
        Logger logger = Logger.getInstance();
        //When
        logger.log("example log");
        //Then
        Assert.assertEquals("example log", logger.getLasLog());
    }
}
