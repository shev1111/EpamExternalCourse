package projects.project1.model.dao;


import projects.project1.model.entity.Locomotive;
import projects.project1.model.entity.PassengerWaggon;
import projects.project1.model.entity.RailTransport;
import java.util.List;

public interface TransportDAO extends GenericDAO<RailTransport> {

    List<PassengerWaggon> selectPassengerWaggons();
    Locomotive selectLocomotive(String engine);

}
