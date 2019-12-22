package copy.task3.task31.model.entity;

import task3.task31.model.entity.AbstractToy;

public class RobotToy extends AbstractToy {
    private String bodyMaterial;

    public RobotToy(String bodyMaterial) {
        this.bodyMaterial = bodyMaterial;
    }

    public RobotToy() {
        this("undefined");
    }

    public String getBodyMaterial() {
        return bodyMaterial;
    }

    public void setBodyMaterial(String bodyMaterial) {
        this.bodyMaterial = bodyMaterial;
    }
}
