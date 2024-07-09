package org.example.dao.custom;

import org.example.dao.CrudDAO;
import org.example.entity.Attendance;

import java.sql.SQLException;

public interface AttendanceDAO extends CrudDAO<Attendance> {
    public boolean update(String attendanceId, String studentName, String date, String in_time, String out_time, String userID) throws SQLException, ClassNotFoundException;
    public Attendance attendanceIdCheck(String attendanceID) throws SQLException, ClassNotFoundException;
}
