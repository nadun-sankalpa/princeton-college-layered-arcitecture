package org.example.bo.custom.Impl.Edit_Impl;

import org.example.bo.custom.EditExamBO;
import org.example.dao.DAOFactory;
import org.example.dao.custom.ExamsDAO;

import java.sql.SQLException;

public class EditExamBOImpl implements EditExamBO {
    ExamsDAO examDAO = (ExamsDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.EXAMS);

    public boolean update(String examID, String examName, String date, String time, String lectureID) throws SQLException, ClassNotFoundException{
        return examDAO.update(examID, examName, date, time, lectureID);
    }
}
