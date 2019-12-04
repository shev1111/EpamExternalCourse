package task1.task13;

import task1.task13.controller.PyramidController;
import task1.task13.view.PyramidPrinter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pyramid size: ");
        int pyramidSize = sc.nextInt();
        PyramidPrinter.printPyramidForValue(pyramidSize);

    }
}