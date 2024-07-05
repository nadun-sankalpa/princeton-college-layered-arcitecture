package org.example.bo.custom;

import java.sql.SQLException;

public interface EditStudentBO  {
    public  boolean update(String studentID, String name, String address, String contactNo, String nicNo, String userID) throws SQLException, ClassNotFoundException;
}
