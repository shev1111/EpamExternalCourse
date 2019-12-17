package task3.task31.model.entity;

import task3.task31.model.interfaces.Soundable;

public class SoundableDoll implements Soundable {
    @Override
    public void sound() {
        System.out.println("Doll sound");
    }
}
