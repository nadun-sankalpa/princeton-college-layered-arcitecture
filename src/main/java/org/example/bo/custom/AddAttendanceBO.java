package org.example.bo.custom;

import org.example.entity.Attendance;

import java.sql.SQLException;

public interface AddAttendanceBO {
    public boolean add(Attendance attendance);

    public boolean update(String attendanceId, String studentName, String date, String in_time, String out_time, String userID) throws SQLException, ClassNotFoundException;

    Attendance attendanceIdCheck(String attendanceID) throws SQLException, ClassNotFoundException;
}
