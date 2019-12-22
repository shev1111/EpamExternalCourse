package task1.task13.view;

import task1.task13.controller.PyramidController;

public class PyramidPrinter {
    public static void printPyramidForValue(int value){
        System.out.println(PyramidController.generatePyramid(value));
    }
}
