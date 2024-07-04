package org.example.bo.custom;

import org.example.entity.Schedule;

import java.sql.SQLException;

public interface AddScheduleBO {
    public boolean add(Schedule schedule) throws SQLException;
}
