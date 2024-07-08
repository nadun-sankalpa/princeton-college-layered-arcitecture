package org.example.bo.custom;

import org.example.bo.SuperBO;
import org.example.entity.Lecturer;

import java.sql.SQLException;

public interface AddLecturerBO extends SuperBO {
    public boolean add(Lecturer lecturer) throws SQLException, ClassNotFoundException;
    public Lecturer lecturerIdCheck(String lecturerID) throws SQLException, ClassNotFoundException;
}
