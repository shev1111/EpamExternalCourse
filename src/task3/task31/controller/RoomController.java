package task3.task31.controller;

import task3.task31.model.Model;
import task3.task31.model.entity.AbstractToy;
import task3.task31.view.InputData;
import task3.task31.view.View;

import java.util.Comparator;

public class RoomController {
    private View view = new View();
    private Model model = new Model();

    public void run(){
        view.print("------------------- Start Program -----------------------");
        view.print("Enter number of toys you want to add ->");

        int numberOfToys = Integer.parseInt(InputData.input());

        view.print("Please enter toys types by pattern to add it in a list:");
        view.print("CAR;price,age,gender,carBrand");
        view.print("DOLL;price,age,gender,dollType");
        view.print("ROBOT;price,age,gender,dollType");

        for (int index = 0; index==numberOfToys;index++){
            view.print("Enter toy type ->");
            String toyPattern = InputData.input();
            AbstractToy toy = ToyParser.parse(toyPattern);
            model.addToyToPlayingRoom(toy);
        }


        view.print("------------------- Sorting -----------------------");
        view.print("Please  toys sort parameter (price, age, gender) ->");
        String sortType = InputData.input().toLowerCase();

        Comparator<AbstractToy> comparator = null;
        switch (sortType){
            case "price":comparator = new Comparator<AbstractToy>() {
                @Override
                public int compare(AbstractToy o1, AbstractToy o2) {
                    return o1.getPrice()-o2.getPrice();
                }
            };break;
            case "age":comparator = new Comparator<AbstractToy>() {
                @Override
                public int compare(AbstractToy o1, AbstractToy o2) {
                    return o1.getAge()-o2.getAge();
                }
            };break;
            case "gender":comparator = new Comparator<AbstractToy>() {
                @Override
                public int compare(AbstractToy o1, AbstractToy o2) {
                    return o1.getGender().compareTo(o2.getGender());
                }
            };
        }
        model.sortToys(comparator);





    }
}
