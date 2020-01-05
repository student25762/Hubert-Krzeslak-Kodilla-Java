package com.kodilla.patterns.singleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SettingFileEngineTestSuite {

    @BeforeClass
    public static void openSettingFile(){
        SettingFileEngine.getInstance().open("myapp.settings");
    }

    @AfterClass
    public static void closeSettingFile(){
        SettingFileEngine.getInstance().close();
    }

    @Test
    public void testGetFileName(){
        //Given
        //When
        String fileName = SettingFileEngine.getInstance().getFileName();
        System.out.println("Open: " + fileName);
        //Then
        Assert.assertEquals("myapp.settings", fileName);
    }

    @Test
    public void testLoadSettings(){
        //Given
        //When
        boolean result = SettingFileEngine.getInstance().loadSettings();
        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void testSaveSettings(){
        //Given
        //When
        boolean result = SettingFileEngine.getInstance().saveSettings();
        //Then
        Assert.assertTrue(result);
    }
}
