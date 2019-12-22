package task2.task21.model;

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
    public String toString() {
        return super.toString() + ", radius=" + radius;
    }

    public static Circle parseCircle(String data){
        String[] tokens = data.split("[;,]");
        return new Circle(tokens[1],Double.parseDouble(tokens[2]));
    }
}
