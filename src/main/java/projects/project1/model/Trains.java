package projects.project1.model;

import projects.project1.model.entity.Passenger;
import projects.project1.model.entity.PassengerWaggon;
import projects.project1.model.entity.RailTransport;
import projects.project1.model.entity.Train;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class Trains {
    //sort
    public static void sort(Train train, Comparator<RailTransport> comp) {
        train.getWaggons().sort(comp);
    }

    //counts passenger & baggage
    public static DataContainer<Integer, Integer> count(Train train) {
        Integer numberOfPassengers = 0;
        Integer weight = 0;
        List<Passenger> passengers;
        for (RailTransport railTransport : train.getWaggons()) {
            if(PassengerWaggon.isPassenger(railTransport)) {
                PassengerWaggon passengerWaggon = (PassengerWaggon) railTransport;
                numberOfPassengers += passengerWaggon.getPassengers().size();
                passengers = passengerWaggon.getPassengers();

                for (Passenger p : passengers) {

                    weight += p.getBaggageWeight();
                }
            }
        }
        return new DataContainer<>(numberOfPassengers, weight);
    }


    public static int countBaggage(Train train) {
        int weight = 0;
        List<Passenger> passengers;
        for (RailTransport railTransport : train.getWaggons()) {
            if(PassengerWaggon.isPassenger(railTransport)) {
                PassengerWaggon passengerWaggon = (PassengerWaggon) railTransport;
                passengers = passengerWaggon.getPassengers();
                for (Passenger p : passengers) {
                    weight += p.getBaggageWeight();
                }
            }
        }
        return weight;
    }

    //waggons are in diapason for number of passengers
    public static List<PassengerWaggon> diapason(Train train, int left, int right) {
        List<PassengerWaggon> waggons = new ArrayList<>();
        if(left < 0 || right < 0 || left > right) {
            throw new IllegalArgumentException();
        }
        for (RailTransport railTransport : train.getWaggons()) {
            if((PassengerWaggon.isPassenger(railTransport))) {

                PassengerWaggon passengerWaggon = (PassengerWaggon) railTransport;
                if (passengerWaggon.getCountPassengers() >= left && passengerWaggon.getCountPassengers() <= right)
                waggons.add(passengerWaggon);
            }
        }
        return waggons;
    }

}
