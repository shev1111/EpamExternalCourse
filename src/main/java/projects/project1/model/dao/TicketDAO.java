package projects.project1.model.dao;


import projects.project1.model.entity.Passenger;
import projects.project1.model.entity.Ticket;

public interface TicketDAO extends GenericDAO<Ticket> {

    void selectPassengerTicket(Passenger p);

}
