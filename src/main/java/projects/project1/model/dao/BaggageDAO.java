package projects.project1.model.dao;


import projects.project1.model.entity.Item;
import projects.project1.model.entity.Passenger;

public interface BaggageDAO extends GenericDAO<Item> {

    void selectBaggage(Passenger passenger);

}
