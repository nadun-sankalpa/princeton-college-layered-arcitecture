package org.example.bo.custom.Impl;

import org.example.bo.custom.AddAttendanceBO;
import org.example.dao.custom.AttendanceDAO;
import org.example.dao.custom.Impl.AttendanceDAOImpl;
import org.example.entity.Attendance;

import java.sql.SQLException;

public class AddAttendanceBOImpl implements AddAttendanceBO {

    AttendanceDAO attendanceDAO = new AttendanceDAOImpl();


    @Override
    public boolean add(Attendance attendance) {
        try {
            return attendanceDAO.add(attendance);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(String attendanceId, String studentName, String date, String in_time, String out_time, String userID) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public Attendance attendanceIdCheck(String attendanceID) throws SQLException, ClassNotFoundException{
        return attendanceDAO.attendanceIdCheck(attendanceID);
    }
}
