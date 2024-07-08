package org.example.bo.custom;

import org.example.bo.SuperBO;
import org.example.entity.Courses;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CoursesBO extends SuperBO {
    public ArrayList<Courses> getAll() throws SQLException, ClassNotFoundException;
}
