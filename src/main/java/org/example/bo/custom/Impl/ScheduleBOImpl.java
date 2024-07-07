package org.example.bo.custom.Impl;

import org.example.bo.custom.ScheduleBO;
import org.example.dao.DAOFactory;
import org.example.dao.custom.ScheduleDAO;
import org.example.entity.Schedule;

import java.sql.SQLException;
import java.util.ArrayList;

public class ScheduleBOImpl implements ScheduleBO {
    ScheduleDAO scheduleDAO = (ScheduleDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.Schedule);
    public ArrayList<Schedule> getAll() throws SQLException, ClassNotFoundException{
        return scheduleDAO.getAll();
    }
}
