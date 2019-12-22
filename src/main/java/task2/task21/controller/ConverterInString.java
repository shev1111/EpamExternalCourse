package task2.task21.controller;

import task2.task21.model.Shape;

class ConverterInString {


    static String convertArrayShapes(Shape[] shapes){
        String result = "";
        for (Shape shape:shapes) {
            result+=shape.draw();
        }
        return result;

    }

    static String convertDouble(double value, String message){
        return String.format("%s = %.2f",message, value);
    }
}
