package projects.project1.model.dao.sqlite;

import projects.project1.model.dao.TicketDAO;
import projects.project1.model.dao.exstractors.ExtractTicket;
import projects.project1.model.entity.Passenger;
import projects.project1.model.entity.Ticket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class SqliteTicket implements TicketDAO {
    private Connection connection;

    SqliteTicket(Connection connection) {
        this.connection = connection;
    }

    @Override
    public int insert(Ticket e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Ticket> findAll() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Ticket findById(int id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean update(Ticket e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void selectPassengerTicket(Passenger p) {
        final String sql = "select * from ticket where idpassenger = ?";
        try(PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, p.getPassengerID());
            ResultSet set = statement.executeQuery();
            p.setTicket(ExtractTicket.extractOneTicket(set));
        } catch (SQLException e) {
            System.err.println(e.getErrorCode());
            System.err.println(e.getSQLState());
            throw new RuntimeException(e);
        }
    }

    @Override
    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
