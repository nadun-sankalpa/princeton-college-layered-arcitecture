package org.example.bo.custom;

import org.example.bo.SuperBO;
import org.example.entity.Schedule;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ScheduleBO extends SuperBO {
    public ArrayList<Schedule> getAll() throws SQLException, ClassNotFoundException;
}
