package projects.project1.model;

import projects.project1.model.entity.*;

import java.util.ArrayList;
import java.util.List;

public final class RailwayStation {
    private List<Train> trains;

    public RailwayStation() {
        trains = new ArrayList<>();
    }

    public void setTrains(List<Train> trains) {
        this.trains = trains;
    }

    public boolean addTrain(Train train) {
        return trains.add(train);
    }

    public boolean removeTrain(Train train) {
        return trains.remove(train);
    }

    public Train getTrain(int index) {
        return trains.get(index);
    }

    public int numberOfTrains() {
        return trains.size();
    }

    public void takeTrain(Passenger passenger, int track) {
        if(passenger == null || track < 0 || track >= trains.size()) {
            throw new IllegalArgumentException();
        }
        Train train = trains.get(track);
        // check ticket
        Ticket ticket = passenger.getTicket();
        if (ticket != null && ticket.getTrainID() == train.getIdTrain()) {

            // success
            for (RailTransport railTransport : train.getWaggons()) {
                if (railTransport.getTransportID() == ticket.getWaggonNumber()) {
                    PassengerWaggon pw = (PassengerWaggon) railTransport;
                    pw.addPassenger(passenger);
                }
            }
        }
    }

}
