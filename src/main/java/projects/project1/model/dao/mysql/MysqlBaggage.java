package projects.project1.model.dao.mysql;



import projects.project1.model.dao.BaggageDAO;
import projects.project1.model.dao.exstractors.ExtractBaggage;
import projects.project1.model.entity.Item;
import projects.project1.model.entity.Passenger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class MysqlBaggage implements BaggageDAO {
    private Connection connection;

    MysqlBaggage(Connection connection) {
        this.connection = connection;
    }

    @Override
    public int insert(Item e) {
        return 0;
    }

    @Override
    public List<Item> findAll() {
        return null;
    }

    @Override
    public Item findById(int id) {
        return null;
    }

    @Override
    public boolean update(Item e) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public void selectBaggage(Passenger p) {
        final String sql = "select iditem, item, weight from item" +
                " join baggage using (iditem)" +
                " where idpassenger = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, p.getPassengerID());
            ResultSet set = statement.executeQuery();
            p.setItems(ExtractBaggage.extractItemList(set));
        } catch (SQLException e) {
            e.printStackTrace();
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