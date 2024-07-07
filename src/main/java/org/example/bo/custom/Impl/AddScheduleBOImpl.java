package org.example.bo.custom.Impl;

import org.example.bo.custom.AddScheduleBO;
import org.example.dao.custom.Impl.ScheduleDAOImpl;
import org.example.dao.custom.ScheduleDAO;
import org.example.entity.Schedule;

import java.sql.SQLException;

public class AddScheduleBOImpl implements AddScheduleBO {
    ScheduleDAO scheduleDAO = new ScheduleDAOImpl();
    public boolean add(Schedule schedule) throws SQLException, ClassNotFoundException {
        try {
            return scheduleDAO.add(schedule);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }

    }
    public Schedule checkScheduleId(String id) throws SQLException, ClassNotFoundException{
        return scheduleDAO.checkScheduleId(id);
    }
    }

