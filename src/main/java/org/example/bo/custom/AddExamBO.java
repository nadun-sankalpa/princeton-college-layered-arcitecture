package org.example.bo.custom;

import org.example.entity.Exams;

import java.sql.SQLException;

public interface AddExamBO {
    public boolean add(Exams exam) throws SQLException, ClassNotFoundException;
}
