package org.example.bo.custom;

import org.example.entity.Schedule;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ScheduleBO {
    public ArrayList<Schedule> getAll() throws SQLException, ClassNotFoundException;
}
