package task1.task12.view;

import task1.task12.controller.PerfectNumbersGenerator;

public class Printer {
    public static void printAllPerfectNumbers(long value){
        System.out.println("Perfect numbers are: "+PerfectNumbersGenerator.getPerfectNumbers(value));
    }
}
