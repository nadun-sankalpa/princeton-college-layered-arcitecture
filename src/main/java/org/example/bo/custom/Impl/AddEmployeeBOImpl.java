package org.example.bo.custom.Impl;

import org.example.bo.custom.AddEmployeeBO;
import org.example.dao.custom.EmployesDAO;
import org.example.dao.custom.Impl.EmployesDAOImpl;
import org.example.entity.Employes;

import java.sql.SQLException;

public class AddEmployeeBOImpl implements AddEmployeeBO {
    EmployesDAO employesDAO = new EmployesDAOImpl();
    public boolean add(Employes employes) throws SQLException, ClassNotFoundException {
        try {
            return employesDAO.add(employes);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }
    public Employes employeeIdCheck(String employeeID) throws SQLException, ClassNotFoundException {
        return employesDAO.employeeIdCheck(employeeID);
    }
}
