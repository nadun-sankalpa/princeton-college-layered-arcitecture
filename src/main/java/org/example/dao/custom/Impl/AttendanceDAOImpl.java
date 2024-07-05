package org.example.dao.custom.Impl;

import org.example.dao.SQLUtil;
import org.example.dao.custom.AttendanceDAO;
import org.example.entity.Attendance;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AttendanceDAOImpl implements AttendanceDAO {
    public ArrayList<Attendance> getAll() throws SQLException, ClassNotFoundException {
        ArrayList<Attendance> allattendance = new ArrayList<>();

        ResultSet rst = SQLUtil.execute("SELECT * FROM attendance");

        while (rst.next()) {
            Attendance attendance = new Attendance(rst.getString("attendance_id"), rst.getString("student_name"), rst.getString("date"), rst.getString("in_time"), rst.getString("out_time"), rst.getString("user_id"));
            allattendance.add(attendance);
        }

        return allattendance;

    }

    public boolean add(Attendance entity) throws SQLException, ClassNotFoundException {
        return SQLUtil.execute("INSERT INTO attendance VALUES(?,?,?,?,?,?)", entity.getAttendanceID(), entity.getStudentID(), entity.getDate(), entity.getIn_time(), entity.getOut_time(), entity.getUserID());
    }

    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return SQLUtil.execute("DELETE FROM attendance WHERE attendance_id = ?", id);
    }

    public boolean update(String attendanceId, String studentName, String date, String in_time, String out_time, String userID) throws SQLException, ClassNotFoundException {
        return SQLUtil.execute("UPDATE attendance SET attendance_id = ?, student_name = ?, date = ?, in_time = ?, out_time = ?, user_id = ?  WHERE attendance_id = ?", attendanceId,studentName, date, in_time, out_time, userID);
    }

    @Override
    public boolean generateNewID() throws SQLException, ClassNotFoundException {
        return false;
    }

    public Attendance attendanceIdCheck(String attendanceID) throws SQLException, ClassNotFoundException {
        ResultSet rst = SQLUtil.execute("SELECT * FROM attendance WHERE attendance_id = ?", attendanceID);

        return new Attendance(rst.getString("attendance_id"), rst.getString("student_name"), rst.getString("date"), rst.getString("in_time"), rst.getString("out_time"), rst.getString("user_id"));


    }
}





