package task2.model;

import java.util.Arrays;
import java.util.Comparator;

public class ShapesColorComparator implements Comparator<Shape> {

    @Override
    public int compare(Shape o1, Shape o2) {

        return o1.getColorShape().compareTo(o2.getColorShape());
    }
}
