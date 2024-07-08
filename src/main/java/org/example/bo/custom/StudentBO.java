package org.example.bo.custom;

import org.example.bo.SuperBO;
import org.example.entity.Student;

import java.sql.SQLException;
import java.util.ArrayList;

public interface StudentBO extends SuperBO {
    public ArrayList<Student> getAll() throws SQLException, ClassNotFoundException;
}
