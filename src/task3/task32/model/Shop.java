package task3.task32.model;

import com.sun.deploy.util.ArrayUtil;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Shop {
    private String shopName;
    private Department[] departments;
    private int numberOfDepartments=0;

     class Department{
        private String name;
        private String productsType;
        private String service;
        private String location;

        public Department(String name, String productsType, String service, String location) {
            this.name = name;
            this.productsType = productsType;
            this.service = service;
            this.location = location;


        }

        @Override
        public String toString() {
            return "Department{" +
                    "name='" + name + '\'' +
                    ", productsType='" + productsType + '\'' +
                    ", service='" + service + '\'' +
                    ", location='" + location + '\'' +
                    '}'+"\n";
        }
    }

    public Shop(String shopName) {
        this.shopName = shopName;
        this.departments = new Department[1];
    }

    public Shop() {
        this("undefined name");
    }

    public boolean createDepartment(String name, String productsType, String service, String location){
        int temDepartmentsNumber=numberOfDepartments;
        if(numberOfDepartments==0){
            departments[numberOfDepartments++] = new Department(name,productsType,service,location);
        }else {
            departments= Arrays.copyOf(departments,departments.length+1);
            departments[numberOfDepartments++] = new Department(name,productsType,service,location);
        }

        return temDepartmentsNumber != numberOfDepartments;
    }

    public boolean deleteDepartmentByName(String name){
        int temDepartmentsNumber=numberOfDepartments;
        for (int index = 0;index<departments.length;index++) {
            if (departments[index].name.equals(name)){
                departments=removeElement(departments,index);
                numberOfDepartments--;
            }
        }
        return temDepartmentsNumber != numberOfDepartments;
    }

    public void sortDepartmentsByName(){
        Arrays.sort(departments, new Comparator<Department>() {
            @Override
            public int compare(Department o1, Department o2) {
                return o1.name.compareTo(o2.name);
            }
        });
    }

    public Department[] getDepartments() {
        return departments;
    }

    private static Department[] removeElement(Department[] departments, int index){
        if (departments == null
                || index < 0
                || index >= departments.length) {

            return departments;
        }

        Department[] updatedDepartments = new Department[departments.length-1];
        for (int arrayIndex = 0, newIndex = 0; arrayIndex < departments.length; arrayIndex++) {

            if (arrayIndex == index) {
                continue;
            }
            updatedDepartments[newIndex++] = departments[arrayIndex];
        }
        return updatedDepartments;

    }

    public String getShopName() {
        return shopName;
    }




    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
}
