package task2.task21.model;

public class Rectangle extends Shape {
    private double width;
    private double heigt;

    public Rectangle(String colorShape, double width, double heigt) {
        super(colorShape);
        this.width = width;
        this.heigt = heigt;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", width=" + width +
                ", heigt=" + heigt;
    }

    @Override
    public double calcArea() {
        return width*heigt;
    }

    public static Rectangle parseTriangle(String data){
        String[] tokens = data.split("[;,]");
        return new Rectangle(
                tokens[1],
                Double.parseDouble(tokens[2]),
                Double.parseDouble(tokens[3]));
    }

}
