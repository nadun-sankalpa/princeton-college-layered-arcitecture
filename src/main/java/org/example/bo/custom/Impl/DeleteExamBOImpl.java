package org.example.bo.custom.Impl;

import org.example.bo.custom.DeleteExamBO;
import org.example.dao.custom.ExamsDAO;
import org.example.dao.custom.Impl.ExamsDAOImpl;

import java.sql.SQLException;

public class DeleteExamBOImpl implements DeleteExamBO {
    ExamsDAO examsDAO = new ExamsDAOImpl();
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return examsDAO.delete(id);
    }
}
