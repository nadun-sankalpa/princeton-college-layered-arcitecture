package org.example.bo.custom.Impl;

import org.example.bo.custom.DeleteEmployeeBO;
import org.example.dao.custom.EmployesDAO;
import org.example.dao.custom.Impl.EmployesDAOImpl;

import java.sql.SQLException;

public class DeleteEmployeeBOImpl implements DeleteEmployeeBO {
    EmployesDAO employesDAO = new EmployesDAOImpl();
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return employesDAO.delete(id);
    }
}
