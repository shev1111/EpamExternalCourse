package task2.task21.controller;

import task2.task21.model.*;

public class ShapeParser {
    public static Shape parse(String shape){
        String type = shape.substring(0, shape.indexOf(";")).toUpperCase();
        switch (ShapeType.valueOf(type)){
            case CIRCLE: return Circle.parseCircle(shape);
            case TRIANGLE:return Triangle.parseTriangle(shape);
            case RECTANGLE:return Rectangle.parseTriangle(shape);
        }
        return null;
    }
}
