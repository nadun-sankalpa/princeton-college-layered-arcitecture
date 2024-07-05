package org.example.bo.custom;

import java.sql.SQLException;

public interface EditEmployeeBO {
    public boolean update(String employeeID, String name, String contactNo, String address, String nicNo) throws SQLException, ClassNotFoundException;
}
