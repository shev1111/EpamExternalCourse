package projects.project1.model.dao.mysql;



import projects.project1.model.dao.PassengerDAO;
import projects.project1.model.dao.exstractors.ExtractPassenger;
import projects.project1.model.entity.Passenger;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


public class MysqlPassenger implements PassengerDAO {
    private Connection connection;

    MysqlPassenger(Connection connection) {
        this.connection = connection;
    }

    @Override
    public int insert(Passenger e) {
        return 0;
    }

    @Override
    public List<Passenger> findAll() {
        final String sql = "select * from passenger";
        try (Statement stat = connection.createStatement()){
            ResultSet rs = stat.executeQuery(sql);
            return ExtractPassenger.extractPassengerList(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Passenger findById(int id) {
        return null;
    }

    @Override
    public boolean update(Passenger e) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public void close()  {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
