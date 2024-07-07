package org.example.bo.custom.Impl;

import org.example.bo.custom.ExamBO;
import org.example.dao.DAOFactory;
import org.example.dao.custom.ExamsDAO;
import org.example.entity.Exams;

import java.sql.SQLException;
import java.util.ArrayList;

public class ExamBOImpl implements ExamBO {
    ExamsDAO examsDAO = (ExamsDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.Exams);
    public ArrayList<Exams> getAll() throws SQLException, ClassNotFoundException {
        return examsDAO.getAll();
    }
}
