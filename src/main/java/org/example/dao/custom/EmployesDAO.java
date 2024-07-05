package org.example.dao.custom;

import org.example.dao.CrudDAO;
import org.example.entity.Employes;

import java.sql.SQLException;
import java.util.ArrayList;

public interface EmployesDAO extends CrudDAO<Employes> {
    public ArrayList<Employes> getAll() throws SQLException, ClassNotFoundException;
    public boolean add(Employes entity) throws SQLException, ClassNotFoundException;
    public boolean update(String employeeID, String name, String contactNo, String address, String nicNo) throws SQLException, ClassNotFoundException;
    public Employes employeeIdCheck(String employeeID) throws SQLException, ClassNotFoundException;
}
