package org.example.bo.custom;

import java.sql.SQLException;

public interface EditAttendanceBO {
    public boolean update( String attendanceId, String studentName, String date, String in_time, String out_time, String userID) throws SQLException, ClassNotFoundException;
}
