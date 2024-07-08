package org.example.bo.custom;

import org.example.bo.SuperBO;

import java.sql.SQLException;

public interface EditStudentBO extends SuperBO {
    public  boolean update(String studentID, String name, String address, String contactNo, String nicNo, String userID) throws SQLException, ClassNotFoundException;
}
