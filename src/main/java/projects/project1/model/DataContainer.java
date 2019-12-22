package projects.project1.model;

public class DataContainer<X, Y> {
    private final X x;
    private final Y y;

    DataContainer(X x, Y y) {
        this.x = x;
        this.y = y;
    }

    public X getX() {
        return x;
    }

    public Y getY() {
        return y;
    }
}
