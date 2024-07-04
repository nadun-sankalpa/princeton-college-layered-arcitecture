package org.example.dao.custom;

import org.example.dao.CrudDAO;
import org.example.entity.Lecturer;

import java.sql.SQLException;

public interface LecturerDAO extends CrudDAO<Lecturer> {
    public Lecturer lecturerIdCheck(String lecturerID) throws SQLException, ClassNotFoundException;
}
