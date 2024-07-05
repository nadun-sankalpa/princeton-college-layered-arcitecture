package org.example.bo.custom;

import org.example.entity.Employes;

import java.sql.SQLException;
import java.util.ArrayList;

public interface EmployeeBO {
    public ArrayList<Employes> getAll() throws SQLException, ClassNotFoundException;
}
