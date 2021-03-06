package projects.project1.controller;

import projects.project1.model.RailwayStation;
import projects.project1.model.dao.*;
import projects.project1.model.entity.Passenger;
import projects.project1.model.entity.RailTransport;
import projects.project1.model.entity.Train;
import projects.project1.model.entity.enums.Engine;
import java.util.ArrayList;
import java.util.List;

class Database {

    static void init(RailwayStation railway) {

        DAOFactory factory = DAOFactory.getDAOFactory(DAOFactory.SQLITE);
        BaggageDAO baggageDAO = factory.baggageDAO();
        PassengerDAO passengerDAO = factory.passengerDAO();
        TicketDAO ticketDAO = factory.ticketDAO();
        TransportDAO transportDAO = factory.transportDAO();

        List<Passenger> passengers = passengerDAO.findAll();

        // create trains
        List<Train> trains = new ArrayList<>();

        List<RailTransport> railTransports = new ArrayList<>(transportDAO.selectPassengerWaggons());
        Train train1 = new Train(transportDAO.selectLocomotive(Engine.DIESEL.toString()), railTransports);

        trains.add(train1);
        railway.setTrains(trains);

        // take train
        // for each passenger, add baggage and set ticket on train
        for (Passenger p : passengers) {
            baggageDAO.selectBaggage(p);
            ticketDAO.selectPassengerTicket(p);
            railway.takeTrain(p, 0);
        }

    }
}
