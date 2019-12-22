package task2.task21.model;

import task2.task21.model.utils.ShapeRandomise;

import java.util.Arrays;
import java.util.Comparator;

public class ShapeModel {
    private Shape[] shapes;

    public ShapeModel() {
        this.shapes = ShapeRandomise.getShapesArray(10);
    }


    public double getTotalAreaShapes(){
        double sum = 0.0;
        for(Shape elem: shapes){
            sum += elem.calcArea();
        }
        return sum;
    }

    public double getTotalAreaShapes(String type){
        double sum = 0.0;
        for(Shape elem: shapes){
            if(elem.getClass().getSimpleName().equalsIgnoreCase(type))sum += elem.calcArea();
        }
        return sum;
    }


    public Shape[] sortShapes(Comparator comparator){
        Shape[] shapesCopy = Arrays.copyOf(shapes,shapes.length);
        Arrays.sort(shapesCopy, comparator);
        return shapesCopy;
    }



    public Shape[] getShapes() {
        return shapes;
    }
}
