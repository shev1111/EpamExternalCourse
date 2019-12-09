package task2;

import task2.controller.ShapeController;
import task2.model.Shape;
import task2.model.utils.ShapeRandomise;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = ShapeRandomise.getShapesArray(10);

        ShapeController.getShapesData(shapes);

        ShapeController.getCircleSum(shapes);

        ShapeController.getTriangleSum(shapes);

        ShapeController.getRectangleSum(shapes);

        ShapeController.getAreaSumOfShapes(shapes);

        ShapeController.sortShapesByArea(shapes);

        ShapeController.getShapesData(shapes);

        ShapeController.sortShapesByColor(shapes);

        ShapeController.getShapesData(shapes);

    }
}
