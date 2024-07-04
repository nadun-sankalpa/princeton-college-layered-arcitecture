package org.example.bo.custom;

import org.example.entity.Employes;

import java.sql.SQLException;

public interface AddEmployeeBO {
    public boolean add(Employes employes) throws SQLException, ClassNotFoundException;
    public Employes employeeIdCheck(String employeeID) throws SQLException, ClassNotFoundException;
}
