package org.example.dao.custom;

import org.example.dao.CrudDAO;
import org.example.entity.Exams;

import java.sql.SQLException;

public interface ExamsDAO extends CrudDAO<Exams> {
    public Exams examIdCheck(String examID) throws SQLException, ClassNotFoundException;
}
