package task3.task31.controller;

import task3.task31.model.entity.*;

public class ToyParser {
    public static AbstractToy parse(String token){
        String objectName = token.substring(0, token.indexOf(";"));
        ToyEnum toyEnums = ToyEnum.valueOf(objectName);
        switch (toyEnums){
            case CAR:return new CarToy();
            case DOLL:return new Doll();
            case ROBOT:return new RobotToy();
        }
        return null;
    }
}
