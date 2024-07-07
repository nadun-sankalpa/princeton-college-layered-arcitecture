package org.example.bo.custom.Impl.Edit_Impl;

import org.example.bo.custom.EditAttendanceBO;
import org.example.dao.DAOFactory;
import org.example.dao.custom.AttendanceDAO;

import java.sql.SQLException;

public class EditAttendanceBOImpl implements EditAttendanceBO {
    AttendanceDAO attendanceDAO = (AttendanceDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.Attendance);

    public boolean update( String attendanceId, String studentName, String date, String in_time, String out_time, String userID) throws SQLException, ClassNotFoundException {
        return attendanceDAO.update(attendanceId, studentName, date, in_time, out_time, userID);
    }
}


