package org.example.dao.custom;

import org.example.dao.CrudDAO;
import org.example.entity.Employes;

import java.sql.SQLException;

public interface EmployesDAO extends CrudDAO<Employes> {
    public boolean add(Employes entity) throws SQLException, ClassNotFoundException;
    public Employes employeeIdCheck(String employeeID) throws SQLException, ClassNotFoundException;
}
