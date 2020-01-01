package projects.project1.controller;

import projects.project1.model.DataContainer;
import projects.project1.model.RailwayStation;
import projects.project1.model.Trains;
import projects.project1.model.entity.PassengerWaggon;
import projects.project1.model.entity.Train;
import projects.project1.view.Commands;
import projects.project1.view.InputData;
import projects.project1.view.Multilingual;
import projects.project1.view.View;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static projects.project1.view.Commands.*;

class MenuController {
    private final RailwayStation railway;
    private final View view;


    MenuController(RailwayStation railway, View view) {
        this.railway = railway;
        this.view = view;
    }

    void execute() {
        while (true) {
            String input = InputData.input().replaceAll("\\s+", " ").trim();
            switch (input) {
                case CMD_HELP:
                    showHelp();
                    break;
                case CMD_SHOW:
                    show();
                    break;
                case CMD_SELECTED:
                    showSelected();
                    break;
                case CMD_SORT:
                    sort();
                    break;
                case CMD_COUNT:
                    count();
                    break;
                case CMD_QUIT:
                    return;
                default:
                    if (input.matches(Commands.SELECT_REGEX)) {
                        select(input);
                    } else if (input.matches(Commands.SHOW_TRAIN_REGEX)) {
                        showSelected(input);
                    } else if (input.matches(Commands.COUNT_IN_RANGE_REGEX)) {
                        inRange(input);
                    } else if (input.equals(" ") || input.isEmpty()) {
                        break;
                    } else {
                        view.println(Multilingual.getResource().getString("incorrect"));
                    }
            }
        }
    }

    private void count() {
        Train t;
        if ((t = UserData.getCurrentTrain()) != null) {
            DataContainer<Integer, Integer> result = Trains.count(t);
            view.println(Multilingual.getResource().getString("quantity_passengers") + result.getX());
            view.println(Multilingual.getResource().getString("quantity_baggages") + result.getY());
        } else {
            view.println(Multilingual.getResource().getString("not_selected"));
        }
    }

    private void checkIndex(int i) {
        if(i < -1 || i >= railway.numberOfTrains()) {
            throw new IllegalArgumentException(Multilingual.getResource().getString("incorrect_track "+i));
        }
    }

    private String findNumber(String input) {
        Pattern p = Pattern.compile("-?\\d+");
        StringBuilder b = new StringBuilder();
        Matcher m = p.matcher(input);
        while (m.find()) {
            b.append(m.group()).append(",");
        }
        return b.substring(0, b.length() - 1);
    }

    private void inRange(String input) {
        String args[] = findNumber(input).split(",");
        Train t;
        if ((t = UserData.getCurrentTrain()) != null) {
            int left = Integer.parseInt(args[0]);
            int right = Integer.parseInt(args[1]);
            view.printCollection(Trains.diapason(t, left, right));
        } else {
            view.println(Multilingual.getResource().getString("not_selected"));
        }
    }

    private void select(String i) {
        int index = Integer.parseInt((i.split("\\s"))[1]);
        try {
            checkIndex(index);
        } catch (IllegalArgumentException e){
            view.printErr(e.getMessage());
            return;
        }
        UserData.setCurrentTrain(railway.getTrain(index));
        view.println(Multilingual.getResource().getString("selected"));
    }

    private void showHelp() {
        view.println(Multilingual.getResource().getString("commands"));
    }

    private void show() {
        for (int i = 0; i < railway.numberOfTrains(); i++) {
            view.println(Multilingual.getResource().getString("track") + i + ":");
            view.println(railway.getTrain(i).toString());
            view.println(View.TRAIN_SEPARATOR);
        }
    }

    private void showSelected() {
        Train t;
        if ((t = UserData.getCurrentTrain()) != null) {
            view.println(t.toString());
            for (int i = 0; i < t.getWaggons().size(); i++) {
                view.println( t.getWaggons().get(i).toString());
            }
        } else {
            view.println(Multilingual.getResource().getString("not_selected"));
        }
    }

    private void showSelected(String i) {
        int index = Integer.parseInt((i.split("\\s"))[2]);
        try {
            checkIndex(index);
        } catch (IllegalArgumentException e){
            view.printErr(e.getMessage());
            return;
        }
        view.println(railway.getTrain(index).toString());
    }

    private void sort() {
        Train t;

        if ((t = UserData.getCurrentTrain()) != null) {
            Trains.sort(t, PassengerWaggon.comfortComparator());
            view.println(Multilingual.getResource().getString("sort"));
        } else {
            view.println(Multilingual.getResource().getString("not_selected"));
        }
    }
}
