package org.example.bo.custom.Impl.Edit_Impl;

import org.example.bo.custom.EditEmployeeBO;
import org.example.dao.DAOFactory;
import org.example.dao.custom.EmployesDAO;

import java.sql.SQLException;

public class EditEmployeeBOImpl implements EditEmployeeBO {
    EmployesDAO employesDAO = (EmployesDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.EMPLOYEES);

    public boolean update(String employeeID, String name, String contactNo, String address, String nicNo) throws SQLException, ClassNotFoundException{
        return employesDAO.update(employeeID, name, contactNo, address, nicNo);
    }
}
