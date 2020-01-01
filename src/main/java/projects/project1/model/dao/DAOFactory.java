package projects.project1.model.dao;


import projects.project1.model.dao.sqlite.SqliteDAO;

// Abstract class DAO Factory
public abstract class DAOFactory {

    //List of DAO types supported by the factory
    public static final int SQLITE = 1;

    // There will be a method for each DAO that can be
    // created. The concrete factories will have to
    // implement these methods.

    public abstract BaggageDAO baggageDAO();
    public abstract PassengerDAO passengerDAO();
    public abstract TicketDAO ticketDAO();
    public abstract TransportDAO transportDAO();

    public static DAOFactory getDAOFactory(int factory) {
        switch (factory) {
            case SQLITE: return new SqliteDAO();
            default: throw new  RuntimeException("No such exception");
        }
    }

}
