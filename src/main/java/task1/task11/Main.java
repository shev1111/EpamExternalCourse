package task1.task11;

import task1.task11.model.NumberContainer;
import task1.task11.view.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for conversion: ");
        int number = sc.nextInt();
        NumberContainer container = new NumberContainer(number);
        Printer.printBinaryValue(container);
        Printer.printOctalValue(container);
        Printer.printHexValue(container);



    }
}
