package task1.task11;

import task1.task11.model.NumberContainer;
import task1.task11.view.Printer;

public class Main {
    public static void main(String[] args) {
        NumberContainer container = new NumberContainer(30);
        Printer.printBinaryValue(container);
        Printer.printOctalValue(container);
        Printer.printHexValue(container);



    }
}
