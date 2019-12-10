package task2.task21.controller;

import task2.task21.model.*;
import task2.task21.model.utils.ShapeCalculator;
import task2.task21.view.Printer;

import java.util.Arrays;

public class ShapeController {

      public static void getShapesData(Shape[] shapes){
          Printer.printShapes(shapes);
      }

      public static void getAreaSumOfShapes(Shape[] shapes){
          Printer.printArea(ShapeCalculator.getShapeSum(shapes));
      }


      public static void getRectangleSum(Shape[] shapes){
          Printer.printRectanglesArea(ShapeCalculator.getShapeSum(shapes, Rectangle.class.getSimpleName()));
      }


      public static void getTriangleSum(Shape[] shapes){
        Printer.printTrianglesArea(ShapeCalculator.getShapeSum(shapes, Triangle.class.getSimpleName()));
      }


      public static void getCircleSum(Shape[] shapes){
        Printer.printCirclesArea(ShapeCalculator.getShapeSum(shapes, Circle.class.getSimpleName()));
      }

      public static void sortShapesByColor(Shape[] shapes){
          Arrays.sort(shapes, new ShapesColorComparator());
      }


      public static void sortShapesByArea(Shape[] shapes){
        Arrays.sort(shapes, new ShapesAreaComparator());
      }
      

}
