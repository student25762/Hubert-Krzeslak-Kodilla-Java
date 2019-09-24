package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private double heightOfTriangle;
    private double sideOfTriangle;
    private String name;

    public Triangle(String name){
        this.name = name;
    }

    public Triangle(double heightOfTriangle, double sideOfTriangle){
        this.heightOfTriangle = heightOfTriangle;
        this.sideOfTriangle = sideOfTriangle;
    }

    public void getField(){
        System.out.println((heightOfTriangle * sideOfTriangle) / 2);
    }

    public String getShapeName(){
        return name;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "heightOfTriangle=" + heightOfTriangle +
                ", sideOfTriangle=" + sideOfTriangle +
                ", name='" + name + '\'' +
                '}';
    }
}
