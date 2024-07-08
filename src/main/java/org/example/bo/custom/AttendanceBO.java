package org.example.bo.custom;

import org.example.bo.SuperBO;
import org.example.entity.Attendance;

import java.sql.SQLException;
import java.util.ArrayList;

public interface AttendanceBO extends SuperBO {
    public ArrayList<Attendance> getAll() throws SQLException, ClassNotFoundException;
}
