package org.example.bo.custom;

import org.example.entity.Student;

import java.sql.SQLException;
import java.util.ArrayList;

public interface StudentBO {
    public ArrayList<Student> getAll() throws SQLException, ClassNotFoundException;
}
