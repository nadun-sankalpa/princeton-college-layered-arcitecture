package org.example.bo.custom;

import org.example.bo.SuperBO;

import java.sql.SQLException;

public interface EditLecturerBO extends SuperBO {

    public boolean update(String lecturerID, String name, String contactNo, String address, String nicNo) throws SQLException, ClassNotFoundException;
}
