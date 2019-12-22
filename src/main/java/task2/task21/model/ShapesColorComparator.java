package task2.task21.model;

import java.util.Comparator;

public class ShapesColorComparator implements Comparator<Shape> {

    @Override
    public int compare(Shape shape1, Shape shape2) {
        return shape1.getColorShape().compareTo(shape2.getColorShape());
    }
}
