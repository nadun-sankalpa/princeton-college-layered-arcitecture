package org.example.bo.custom.Impl.Edit_Impl;

import org.example.bo.custom.EditScheduleBO;
import org.example.dao.DAOFactory;
import org.example.dao.custom.ScheduleDAO;

import java.sql.SQLException;

public class EditScheduleBOImpl implements EditScheduleBO {
ScheduleDAO scheduleDAO = (ScheduleDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SCHEDULE);

    public boolean update(String scheduleID, String moduleName, String date, String time, String lecturerID) throws SQLException, ClassNotFoundException{
        return scheduleDAO.update(scheduleID, moduleName, date, time, lecturerID);
    }
}
