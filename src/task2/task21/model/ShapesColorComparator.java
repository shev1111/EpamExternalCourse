package task2.task21.model;

import java.util.Comparator;

public class ShapesColorComparator implements Comparator {
    @Override
    public int compare(Object shape1, Object shape2) {
        return ((Shape)shape1).getColorShape().compareTo(((Shape) shape2).getColorShape());
    }
}
