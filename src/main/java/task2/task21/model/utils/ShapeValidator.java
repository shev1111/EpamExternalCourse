package task2.task21.model.utils;

class ShapeValidator {
    static boolean isTriangleValid(double a, double b, double c){
        return a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a;
    }
}
