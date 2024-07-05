package org.example.bo.custom;

import java.sql.SQLException;

public interface EditExamBO {

    public boolean update(String examID, String examName, String date, String time, String lectureID) throws SQLException, ClassNotFoundException;
}
