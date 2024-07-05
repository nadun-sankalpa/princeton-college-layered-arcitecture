package org.example.dao.custom;

import org.example.dao.CrudDAO;
import org.example.entity.Schedule;

import java.sql.SQLException;

public interface ScheduleDAO extends CrudDAO<Schedule> {
    public Schedule checkScheduleId(String id) throws SQLException, ClassNotFoundException;
    public  boolean update(String scheduleID, String moduleName, String date, String time, String lecturerID) throws SQLException, ClassNotFoundException;
}
