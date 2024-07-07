package org.example.bo.custom;

import java.sql.SQLException;

public interface DeleteEmployeeBO {
    public boolean delete(String id) throws SQLException, ClassNotFoundException;
}
