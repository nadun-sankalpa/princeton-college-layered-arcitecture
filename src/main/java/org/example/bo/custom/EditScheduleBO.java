package org.example.bo.custom;

import java.sql.SQLException;

public interface EditScheduleBO {
    public  boolean update(String scheduleID, String moduleName, String date, String time, String lecturerID) throws SQLException, ClassNotFoundException;
}
