package org.example.bo.custom.Impl;

import org.example.bo.custom.DeleteAttendanceBO;
import org.example.dao.custom.*;
import org.example.dao.custom.Impl.*;

import java.sql.SQLException;

public class DeleteAttendanceBOImpl implements DeleteAttendanceBO {
    AttendanceDAO attendanceDAO = new AttendanceDAOImpl();

    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return attendanceDAO.delete(id);
    }


}
