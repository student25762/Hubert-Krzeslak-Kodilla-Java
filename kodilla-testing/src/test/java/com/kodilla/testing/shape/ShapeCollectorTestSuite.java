package com.kodilla.testing.shape;
import org.junit.*;

public class ShapeCollectorTestSuite {

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("Beginning of tests");
    }
    @AfterClass
    public static void afterAllTests(){
        System.out.println("Tests are finished");
    }
    @Before
    public void before(){
        System.out.println("Test case begin");
    }
    @After
    public void after(){
        System.out.println("Test case end");
    }
    @Test
    public void testCaseAddFigure(){
        //Given
        Shape triangle = new Triangle(12, 5.2);
        ShapeCollector collector = new ShapeCollector();
        //When
        collector.shapes.add(triangle);
        //Then
        Assert.assertEquals(1, collector.shapes.size());
    }

    @Test
        public void testCaseRemoveFigure(){
        //Given
        Shape triangle = new Triangle(12, 5.2);
        ShapeCollector collector = new ShapeCollector();
        collector.shapes.add(triangle);
        //When
        boolean result = collector.shapes.remove(triangle);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, collector.shapes.size());
    }

    @Test
    public void testCaseGetFigure(){
        //Given
        Shape triangle = new Triangle(12, 5.2);
        ShapeCollector collector = new ShapeCollector();
        collector.shapes.add(triangle);
        //When
        Shape retrievedShape = collector.shapes.get(0);
        //Then
        Assert.assertEquals(retrievedShape, triangle);
    }

    @Test
    public void testCaseRemoveNotExistingFigure(){
        //Given
        Shape triangle = new Triangle(12, 5.2);
        ShapeCollector collector = new ShapeCollector();
        //When
        boolean result = collector.shapes.remove(triangle);
        //Then
        Assert.assertFalse(result);
    }
}
