package task1.task11.view;

import task1.task11.controller.NumberTypeConverter;
import task1.task11.model.NumberContainer;

public class Printer {
    public static void printHexValue(NumberContainer container){
        System.out.println("Hexadecimal system: "+NumberTypeConverter.convert(container,16));
    }
    public static void printOctalValue(NumberContainer container){
        System.out.println("Octal system: "+NumberTypeConverter.convert(container,8));
    }
    public static void printBinaryValue(NumberContainer container){
        System.out.println("Binary system: "+NumberTypeConverter.convert(container,2));
    }
}
