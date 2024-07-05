package org.example.bo.custom.Impl;

import org.example.bo.custom.AddAttendanceBO;
import org.example.dao.custom.AttendanceDAO;
import org.example.dao.custom.Impl.AttendanceDAOImpl;
import org.example.entity.Attendance;

import java.sql.SQLException;

public class AddAttendanceBOImpl implements AddAttendanceBO {

    AttendanceDAO attendanceDAO = new AttendanceDAOImpl();

    @Override
    public boolean add(Attendance attendance) throws SQLException, ClassNotFoundException {
        return attendanceDAO.add(attendance);
    }

    @Override
    public Attendance attendanceIdCheck(String id) throws SQLException, ClassNotFoundException {
        return attendanceDAO.attendanceIdCheck(id);
    }
}
