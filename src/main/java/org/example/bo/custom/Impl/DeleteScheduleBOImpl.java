package org.example.bo.custom.Impl;

import org.example.bo.custom.DeleteScheduleBO;
import org.example.dao.custom.Impl.ScheduleDAOImpl;
import org.example.dao.custom.ScheduleDAO;

import java.sql.SQLException;

public class DeleteScheduleBOImpl implements DeleteScheduleBO {
    ScheduleDAO scheduleDAO = new ScheduleDAOImpl();
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return scheduleDAO.delete(id);
    }
}
