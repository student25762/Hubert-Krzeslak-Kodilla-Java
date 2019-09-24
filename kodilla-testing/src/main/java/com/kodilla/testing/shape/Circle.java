package com.kodilla.testing.shape;

public class Circle implements Shape {
    private double radius;
    private String name = "circle";

    public Circle(double radius){
        this.radius = radius;
    }

    public void getField(){
        System.out.println(2*radius*Math.PI);
    }

    public String getShapeName(){
        return name;
    }
}
