package task2.model.utils;

import task2.model.Circle;
import task2.model.Rectangle;
import task2.model.Shape;
import task2.model.Triangle;

import java.util.Random;

public class ShapeRandomise {

    private static String[] colors ={"RED", "GREEN", "BLUE"};
    private static Random random = new Random();

    public static Shape[] getShapesArray(int arraySize){
        Shape[] shapes = new Shape[arraySize];
        for (int index = 0; index<shapes.length;index++) {
            shapes[index]=ShapeRandomise.getRandomShape();
        }
        return shapes;
    }

    private static Shape getRandomShape(){
        int index = random.nextInt(3);
        switch (index){
            case 0:return getRandomRectangle();
            case 1:return getRandomTriangle();
            case 2:return getRandomCircle();
        }
        return getRandomCircle();
    }

    private static Rectangle getRandomRectangle(){
        return new Rectangle(getRandomColor(), getRandomValue(), getRandomValue());
    }

    private static Triangle getRandomTriangle(){
        double a=0;
        double b=0;
        double c=0;
        while (!Triangle.isTriangleValid(a,b,c)){
            a = getRandomValue();
            b = getRandomValue();
            c = getRandomValue();
        }
        return new Triangle(getRandomColor(),a,b,c);

    }

    private static Circle getRandomCircle(){
        return new Circle(getRandomColor(), getRandomValue());
    }

    private static String getRandomColor(){
        return colors[random.nextInt(colors.length)];
    }

    private static double getRandomValue(){
        return random.nextInt(20)+1;
    }


}
