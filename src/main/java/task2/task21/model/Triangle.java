package task2.task21.model;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(String colorShape, double a, double b, double c) {
        super(colorShape);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public String toString() {
        return super.toString() +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c;
    }



    @Override
    public double calcArea() {
        Double semiPerimeter = (a+b+c)/2;
        return Math.sqrt(semiPerimeter*(semiPerimeter-a)*(semiPerimeter-b)*(semiPerimeter-c));

    }

    public static Triangle parseTriangle(String data){
        String[] tokens = data.split("[;,]");
        return new Triangle(
                tokens[1],
                Double.parseDouble(tokens[2]),
                Double.parseDouble(tokens[3]),
                Double.parseDouble(tokens[4]));
    }
}
