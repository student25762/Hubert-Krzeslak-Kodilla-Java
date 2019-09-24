package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void addFigure(Shape shape){
        shapes.add(shape);
    }

    public void removeFigure(int index){
        shapes.remove(index);
    }

    public void getFigure(int index){
        shapes.get(index);
    }

    public void showFigures(){
        for(Shape s : shapes){
            System.out.println(s.getShapeName());
        }
    }
}
