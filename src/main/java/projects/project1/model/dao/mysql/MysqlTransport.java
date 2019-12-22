package projects.project1.model.dao.mysql;

import projects.project1.model.dao.TransportDAO;
import projects.project1.model.dao.exstractors.ExtractTransport;
import projects.project1.model.entity.Locomotive;
import projects.project1.model.entity.PassengerWaggon;
import projects.project1.model.entity.RailTransport;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class MysqlTransport implements TransportDAO {
    private Connection connection;

    MysqlTransport(Connection connection) {
        this.connection = connection;
    }

    @Override
    public int insert(RailTransport e) {
        return 0;
    }

    @Override
    public List<RailTransport> findAll() {
        return null;
    }

    @Override
    public RailTransport findById(int id) {
        return null;
    }

    @Override
    public boolean update(RailTransport e) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Locomotive selectLocomotive(int trainID, int order) {
        // order = 0, head, order = -1, tail
        if (order != 0 && order != -1) {
            throw new RuntimeException();
        }
        final String sql = "select idtransport,weight,wheeldiameter," +
                " name, manufacturedate, color, engine, speed" +
                " from transport where idtrain = ? and indexnumber = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setInt(1, trainID);
            statement.setInt(2, order);
            ResultSet set = statement.executeQuery();
            return ExtractTransport.extractLocomotive(set);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<PassengerWaggon> selectPassengerWaggons(int trainID) {
        final String sql = "select idtransport,weight,wheeldiameter," +
                " name, manufacturedate, color, comfort," +
                " seats, indexnumber" +
                " from transport where idtrain = ? and clazz = 'PassengerWaggon'";
        try (PreparedStatement prepared = connection.prepareStatement(sql)){
            prepared.setInt(1, trainID);
            ResultSet rs = prepared.executeQuery();
            return ExtractTransport.extractPassengerWaggons(rs);
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
