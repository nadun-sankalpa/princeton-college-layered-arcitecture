package org.example.dao.custom;

import org.example.dao.CrudDAO;
import org.example.entity.Exams;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ExamsDAO extends CrudDAO<Exams> {
    public Exams examIdCheck(String examID) throws SQLException, ClassNotFoundException;
    public boolean update(String examID, String examName, String date, String time, String lectureID) throws SQLException, ClassNotFoundException;
    public ArrayList<Exams> getAll() throws SQLException, ClassNotFoundException;
}
