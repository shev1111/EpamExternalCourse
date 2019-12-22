package task3.task32.model;

import task2.task21.model.Shape;

public class ShopModel {
    private Shop shop = new Shop("grocery store");

    public boolean insertDepartment(String token){
        String[] parameters = token.split(",");
        return shop.createDepartment(parameters[0],parameters[1],parameters[2],parameters[3]);
    }

    public boolean deleteDepartmentByName(String name){
        return shop.deleteDepartmentByName(name);
    }

    public void sortDepartmentsByName(){
        shop.sortDepartmentsByName();
    }

    public Shop.Department[] getDepartments(){
        return shop.getDepartments();
    }


}
