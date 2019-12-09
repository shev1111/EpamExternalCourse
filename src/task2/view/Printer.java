package task2.view;

import task2.model.Shape;

public class Printer {

    public static void printShapes(Shape[] shapes){
        for (Shape shape :shapes) {
            shape.draw();
        }
        System.out.println("\n");
    }

    public static void printArea(double area){
        System.out.printf("Area of all shapes is %.2f\n\n", area);
    }

    public static void printRectanglesArea(double area){
        System.out.printf("Area of all rectangles %.2f\n\n", area);
    }

    public static void printTrianglesArea(double area){
        System.out.printf("Area of all triangles %.2f \n\n", area);
    }

    public static void printCirclesArea(double area){
        System.out.printf("Area of all circles is %.2f\n\n", area);
    }
}
