package task3.task31.model.entity;

import task3.task31.model.interfaces.Movable;

public class MovableRobot implements Movable {
    @Override
    public void move() {
        System.out.println("Robot move");
    }
}

