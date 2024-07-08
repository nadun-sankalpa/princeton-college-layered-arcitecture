package org.example.bo.custom;

import org.example.bo.SuperBO;

import java.sql.SQLException;

public interface EditScheduleBO extends SuperBO {
    public  boolean update(String scheduleID, String moduleName, String date, String time, String lecturerID) throws SQLException, ClassNotFoundException;
}
