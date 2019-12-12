package task2.task21.model;

import java.util.Comparator;

public class ShapesAreaComparator implements Comparator {

    @Override
    public int compare(Object shape1, Object shape2) {
        return (int) (((Shape) shape1).calcArea()-((Shape) shape2).calcArea());

    }
}
