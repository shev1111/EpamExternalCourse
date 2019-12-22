package projects.project1.model.dao;

import java.util.List;

public interface GenericDAO<T> {

    int insert(T e);
    List<T> findAll();
    T findById(int id);
    boolean update(T e);
    boolean delete(int id);
    void close();

}
