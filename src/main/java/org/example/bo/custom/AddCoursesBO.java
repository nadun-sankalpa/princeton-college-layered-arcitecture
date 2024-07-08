package org.example.bo.custom;

import org.example.bo.SuperBO;
import org.example.entity.Courses;

import java.sql.SQLException;

public interface AddCoursesBO extends SuperBO {
    public boolean add(Courses courses) throws SQLException, ClassNotFoundException;

    public Courses courseIDCheck(String courseID) throws SQLException, ClassNotFoundException;
}
