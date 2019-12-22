package task2.task21.controller;

import task2.task21.model.*;
import task2.task21.view.InputData;
import task2.task21.view.Printer;
import java.util.Comparator;

public class ShapeController {

    private ShapeModel model = new ShapeModel();
    private Printer printer = new Printer();

    public void run(){
        createGeometryInstance();

        getTotalShapesArea();

        getTotalShapesAreaByType();

        sortShapesByCriteria();
    }

    private void createGeometryInstance() {
        printer.print("Enter geometry pattern -> ");
        printer.print("(RECTANGLE;color,a,b) -> ");
        String shapePattern = InputData.input().toLowerCase();
        printer.print(ShapeParser.parse(shapePattern).toString());
        printer.print("\n");
    }

    private void sortShapesByCriteria() {
        printer.print("Enter criteria sorting (area, color) -> ");
        Comparator comparator = null;
        String criteria = InputData.input().toLowerCase();
        switch (criteria){
            case "area":
              comparator =  new Comparator<Shape>() {
                    @Override
                    public int compare(Shape o1, Shape o2) {
                        return (int) (o1.calcArea()-o2.calcArea());
                    }
                };break;
            case "color":
                comparator = new Comparator<Shape>() {
                    @Override
                    public int compare(Shape o1, Shape o2) {
                        return o1.getColorShape().compareTo(o2.getColorShape());
                    }
                };break;
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
