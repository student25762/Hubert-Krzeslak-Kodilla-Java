package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int index) {
        Shape shape = null;
        if (index >= 0 && index < shapes.size()) {
            shape = shapes.get(index);
        }
        return shape;
    }

    public int getShapesQuantity() {
        return shapes.size();
    }

    public void showFigures() {
        for (Shape s : shapes) {
            System.out.println(s.getShapeName());
        }
    }
}
