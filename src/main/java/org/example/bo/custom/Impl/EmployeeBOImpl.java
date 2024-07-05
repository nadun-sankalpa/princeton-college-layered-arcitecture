package org.example.bo.custom.Impl;

import org.example.bo.custom.EmployeeBO;
import org.example.dao.DAOFactory;
import org.example.dao.custom.EmployesDAO;
import org.example.entity.Employes;

import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeBOImpl implements EmployeeBO {
    EmployesDAO employesDAO = (EmployesDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.EMPLOYEE);
    public ArrayList<Employes> getAll() throws SQLException, ClassNotFoundException{
        return employesDAO.getAll();
    }
}
