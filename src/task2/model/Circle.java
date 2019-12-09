package task2.model;

public class Circle extends Shape {

    private double radius;

    public Circle(String colorShape, double radius) {
        super(colorShape);
        if(radius!=0) {
            this.radius = radius;
        }else {
            System.out.println("Circle's radius value can't be negative");
        }
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.printf("%s; area=%.2f\n", this, calcArea());
    }

    @Override
    public String toString() {
        return super.toString() + ", radius=" + radius;
    }
}
