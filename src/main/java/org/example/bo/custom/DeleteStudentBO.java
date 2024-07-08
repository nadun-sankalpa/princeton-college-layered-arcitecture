package org.example.bo.custom;

import org.example.bo.SuperBO;

import java.sql.SQLException;

public interface DeleteStudentBO extends SuperBO {
    public boolean delete(String id) throws SQLException, ClassNotFoundException;
}
