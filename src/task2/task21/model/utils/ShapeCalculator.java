package task2.task21.model.utils;

import task2.task21.model.Shape;

public class ShapeCalculator {

    public static double getShapeSum(Shape[] shapes){
        double shapesSum = 0;
        for (Shape shape : shapes) {
            shapesSum = shapesSum + shape.calcArea();
        }
        return shapesSum;
    }
    public static double getShapeSum(Shape[] shapes,String simpleClassName){
        double shapesSum = 0;
        for (Shape shape : shapes) {
            if(simpleClassName.equals(shape.getClass().getSimpleName()))shapesSum = shapesSum + shape.calcArea();
        }
        return shapesSum;
    }

}
