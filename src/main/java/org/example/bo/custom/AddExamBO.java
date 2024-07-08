package org.example.bo.custom;

import org.example.bo.SuperBO;
import org.example.entity.Exams;

import java.sql.SQLException;

public interface AddExamBO  extends SuperBO {
    public boolean add(Exams exam) throws SQLException, ClassNotFoundException;

    public Exams examIdCheck(String examID) throws SQLException, ClassNotFoundException;
}
