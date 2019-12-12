package task2.task21.controller;

import task2.task21.model.*;
import task2.task21.view.InputData;
import task2.task21.view.Printer;
import java.util.Comparator;

public class ShapeController {

    private ShapeModel model = new ShapeModel();
    private Printer printer = new Printer();

    public void run(){
        getTotalShapesArea();

        getTotalShapesAreaByType();

        sortShapesByCriteria();
    }

    private void sortShapesByCriteria() {
        printer.print("Enter criteria sorting (area, color) -> ");
        Comparator comparator = null;
        String criteria = InputData.input().toLowerCase();
        switch (criteria){
            case "area":
                comparator = new ShapesAreaComparator();break;
            case "color":
                comparator = new ShapesColorComparator();break;
            default: printer.print("Invalid criteria!!!");
        }

        if(comparator!=null){
            printer.print(ConverterInString.convertArrayShapes(model.sortShapes(comparator)));
        }
    }

    private void getTotalShapesAreaByType() {
        printer.print("Enter type shape (Circle, Rectangle, Triangle) -> ");
        String type = InputData.input();
        printer.print(ConverterInString.convertDouble(model.getTotalAreaShapes(type), type+" area"));
        printer.print("---------------------------------------------------------");
    }

    private void getTotalShapesArea() {
        printer.print(ConverterInString.convertArrayShapes(model.getShapes()));
        printer.print("---------------------------------------------------------");
        printer.print(ConverterInString.convertDouble(model.getTotalAreaShapes(), "All shapes area sum"));
        printer.print("---------------------------------------------------------");
    }

}
