package copy.task3.task31.model.entity;

import task3.task31.model.entity.AbstractToy;

public class Doll extends AbstractToy {
    private String dollType;

    public Doll(String dollType) {
        this.dollType = dollType;
    }

    public Doll() {
        this("undefined");
    }

    public String getDollType() {
        return dollType;
    }

    public void setDollType(String dollType) {
        this.dollType = dollType;
    }
}
