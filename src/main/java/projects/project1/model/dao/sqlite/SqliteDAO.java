package projects.project1.model.dao.sqlite;

import projects.project1.model.dao.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqliteDAO extends DAOFactory {

    @Override
    public BaggageDAO baggageDAO() {
        return new SqliteBaggage(getConnection());
    }

    @Override
    public PassengerDAO passengerDAO() {
        return new SqlitePassenger(getConnection());
    }

    @Override
    public TicketDAO ticketDAO() {
        return new SqliteTicket(getConnection());
    }

    @Override
    public TransportDAO transportDAO() {
        return new SqliteTransport(getConnection());
    }

    private Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:sqlite:src/main/java/projects/project1/database/rail.db");
        } catch (SQLException e) {
            System.err.println(e.getErrorCode());
            System.err.println(e.getSQLState());
            throw new RuntimeException(e);
        }

    }

}
