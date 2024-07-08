package org.example.bo.custom;

import org.example.bo.SuperBO;
import org.example.entity.Exams;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ExamBO extends SuperBO {
    public ArrayList<Exams> getAll() throws SQLException, ClassNotFoundException;
}
