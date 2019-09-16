package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test case begin!");
    }
    @After
    public void after(){
        System.out.println("Test case end!");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test suite begin!");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test suite end!");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> numbers = new ArrayList<>();
        //When
        OddNumbersExterminator listOfNumbers = new OddNumbersExterminator();
        //Then
        if (numbers.isEmpty()){
            listOfNumbers.exterminate(numbers);
        }
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(19);
        numbers.add(1);
        numbers.add(20);
        numbers.add(7);
        //When
        OddNumbersExterminator listOfNumbers = new OddNumbersExterminator();
        //Then
        listOfNumbers.exterminate(numbers);
    }
}
