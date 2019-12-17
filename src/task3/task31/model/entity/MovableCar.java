package task3.task31.model.entity;

import task3.task31.model.interfaces.Movable;

public class MovableCar implements Movable {
    @Override
    public void move() {
        System.out.println("Car move");
    }
}
