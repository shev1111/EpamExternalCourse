package projects.project1.controller;

import projects.project1.model.RailwayStation;
import projects.project1.view.InputData;
import projects.project1.view.Multilingual;
import projects.project1.view.View;
import static projects.project1.view.Commands.UA;
import static projects.project1.view.Commands.ENG;

public class Controller {
    private RailwayStation railway;
    private View view;

    public Controller() {
        railway = new RailwayStation();
        view = new View();
    }

    public void run(){
        Database.init(railway);
        view.print(View.SELECT_LANGUAGE);
        MenuController menuController = new MenuController(railway,view);
        selectLanguage();
        view.print(Multilingual.getResource().getString("help_msg"));
        menuController.execute();

    }

    private void selectLanguage() {
        while (true) {
            String input = InputData.input();
            input = input.trim();
            switch (input) {
                case UA:
                    Multilingual.switchLanguage(Multilingual.Language.UA);
                    return;
                case ENG:
                    Multilingual.switchLanguage(Multilingual.Language.ENG);
                    return;
                default:
                    if(input.equals(" ") || input.isEmpty()) {
                        break;
                    }
                    view.printErr("incorrect language");
                    view.println(View.SELECT_LANGUAGE);
            }
        }
    }
}
