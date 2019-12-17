package task2.task21.controller;

import task2.task21.model.Circle;
import task2.task21.model.Shape;
import task2.task21.model.ShapeType;

public class ShapeParser {
    public static Shape parse(String shape){
        String type = shape.substring(0, shape.indexOf(":")).toUpperCase();
        switch (ShapeType.valueOf(type)){
            case CIRCLE: return Circle.parseCircle(shape);
        }
        return null;
    }
}
