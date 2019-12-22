package task3.task32.controller;


import task3.task32.model.ShopModel;
import task3.task32.view.InputData;
import task3.task32.view.View;

public class Controller {
    private View view = new View();
    private ShopModel model = new ShopModel();

    public void run(){
        inputDepartmentsData();

        sortDepartments();

        deleteDepartment();

    }

    private void deleteDepartment() {
        view.print("--------------------Delete department---------------------");
        String departmentName = InputData.input();
        model.deleteDepartmentByName(departmentName);
        view.print(ConverterInString.convertArray(model.getDepartments()));
    }

    private void sortDepartments() {
        view.print("--------------------Sort departments---------------------");
        model.sortDepartmentsByName();
        view.print(ConverterInString.convertArray(model.getDepartments()));
    }

    private void inputDepartmentsData() {
        view.print("Enter number of departments you want to add ->");

        int numberOfDepartment = Integer.parseInt(InputData.input());

        view.print("Pattern to add it in a list:");
        view.print("name,productsType,service,location");

        for (int index = 0; index<numberOfDepartment;index++){
            view.print("Enter department characteristics by pattern->");
            String departmentPattern = InputData.input();
            model.insertDepartment(departmentPattern);
        }
        view.print("--------------------Shop departments---------------------");
        view.print(ConverterInString.convertArray(model.getDepartments()));
    }
}
