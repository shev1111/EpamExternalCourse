package projects.project1.controller;


import projects.project1.model.entity.Train;

class UserData {
    private static Train current;

    static void setCurrentTrain(Train train) {
        current = train;
    }

    static Train getCurrentTrain() {
        return current;
    }
}
