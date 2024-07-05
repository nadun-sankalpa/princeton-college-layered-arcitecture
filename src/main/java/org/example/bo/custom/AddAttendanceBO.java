package org.example.bo.custom;

import org.example.entity.Attendance;

import java.sql.SQLException;

public interface AddAttendanceBO {
    public boolean add(Attendance entity) throws SQLException, ClassNotFoundException;

    public Attendance attendanceIdCheck(String id) throws SQLException, ClassNotFoundException;
}
