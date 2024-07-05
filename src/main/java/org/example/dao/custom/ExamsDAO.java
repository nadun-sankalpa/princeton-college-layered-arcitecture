package org.example.dao.custom;

import org.example.dao.CrudDAO;
import org.example.entity.Exams;

import java.sql.SQLException;

public interface ExamsDAO extends CrudDAO<Exams> {
    public Exams examIdCheck(String examID) throws SQLException, ClassNotFoundException;
    public boolean update(String examID, String examName, String date, String time, String lectureID) throws SQLException, ClassNotFoundException;
}
