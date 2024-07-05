package org.example.bo.custom;

import java.sql.SQLException;

public interface EditLecturerBO {

    public boolean update(String lecturerID, String name, String contactNo, String address, String nicNo) throws SQLException, ClassNotFoundException;
}
