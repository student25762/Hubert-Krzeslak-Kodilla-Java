package com.kodilla.testing.shape;

public class Square implements Shape {
    private double sideOfSquareA;
    private double sideOfSquareB;
    private String name = "square";

    public Square(double sideOfSquareA, double sideOfSquareB){
        this.sideOfSquareA = sideOfSquareA;
        this.sideOfSquareB = sideOfSquareB;
    }

    public void getField(){
        System.out.println(sideOfSquareA * sideOfSquareB);
    }

    public String getShapeName(){
        return name;
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideOfSquareA=" + sideOfSquareA +
                ", sideOfSquareB=" + sideOfSquareB +
                ", name='" + name + '\'' +
                '}';
    }
}
