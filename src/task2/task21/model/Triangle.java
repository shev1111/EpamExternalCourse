package task2.task21.model;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(String colorShape, double a, double b, double c) {
        super(colorShape);
        if(isTriangleValid(a,b,c)){
            this.a = a;
            this.b = b;
            this.c = c;
        }else {
            System.out.println("You can't build triangle with this parameters please read geometry rules");
        }
    }

    public static boolean isTriangleValid(double a, double b, double c){
        return a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a;
    }

    @Override
    public void draw() {
        System.out.printf("%s; area=%.2f\n", this, calcArea());
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
}
