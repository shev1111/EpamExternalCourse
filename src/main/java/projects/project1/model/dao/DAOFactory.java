package projects.project1.model.dao;


import projects.project1.model.dao.mysql.MysqlDAO;

import java.sql.SQLException;

// Abstract class DAO Factory
public abstract class DAOFactory {

    //List of DAO types supported by the factory
    public static final int MYSQL = 1;

    // There will be a method for each DAO that can be
    // created. The concrete factories will have to
    // implement these methods.

    public abstract BaggageDAO baggageDAO();
    public abstract PassengerDAO passengerDAO();
    public abstract TicketDAO ticketDAO();
    public abstract TransportDAO transportDAO();

    public static DAOFactory getDAOFactory(int factory) {
        switch (factory) {
            case MYSQL: return new MysqlDAO();

        }
        return null;
    }

}
