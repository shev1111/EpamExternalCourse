package task2.task21.model;

import java.util.Comparator;

public class ShapesAreaComparator implements Comparator<Shape> {

    @Override
    public int compare(Shape shape1, Shape shape2) {
        return (int) (shape1.calcArea()-shape2.calcArea());
    }
}
