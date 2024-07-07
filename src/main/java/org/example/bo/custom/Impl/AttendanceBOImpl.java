package org.example.bo.custom.Impl;

import org.example.bo.custom.AttendanceBO;
import org.example.dao.DAOFactory;
import org.example.dao.custom.AttendanceDAO;
import org.example.entity.Attendance;

import java.sql.SQLException;
import java.util.ArrayList;

public class AttendanceBOImpl implements AttendanceBO {
    AttendanceDAO attendanceDAO = (AttendanceDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.Attendance);
    public ArrayList<Attendance> getAll() throws SQLException, ClassNotFoundException {
        return attendanceDAO.getAll();
    }
}
