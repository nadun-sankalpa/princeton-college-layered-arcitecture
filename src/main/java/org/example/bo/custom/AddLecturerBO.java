package org.example.bo.custom;

import org.example.entity.Lecturer;

import java.sql.SQLException;

public interface AddLecturerBO {
    public boolean add(Lecturer lecturer) throws SQLException, ClassNotFoundException;
    public Lecturer lecturerIdCheck(String lecturerID) throws SQLException, ClassNotFoundException;
}
