package org.example.bo.custom;

import org.example.bo.SuperBO;

import java.sql.SQLException;

public interface EditAttendanceBO extends SuperBO {
    public boolean update( String attendanceId, String studentName, String date, String in_time, String out_time, String userID) throws SQLException, ClassNotFoundException;
}
