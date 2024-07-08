package org.example.bo.custom;

import org.example.bo.SuperBO;

import java.sql.SQLException;

public interface EditExamBO extends SuperBO {

    public boolean update(String examID, String examName, String date, String time, String lectureID) throws SQLException, ClassNotFoundException;
}
