package org.example.dao.custom;

import org.example.dao.CrudDAO;
import org.example.entity.Lecturer;

import java.sql.SQLException;
import java.util.ArrayList;

public interface LecturerDAO extends CrudDAO<Lecturer> {
    public int getLecturerCount() throws SQLException, ClassNotFoundException;
    public ArrayList<Lecturer> getAll() throws SQLException, ClassNotFoundException;
    public Lecturer lecturerIdCheck(String lecturerID) throws SQLException, ClassNotFoundException;
    public boolean update(String lecturerID, String name, String contactNo, String address, String nicNo) throws SQLException, ClassNotFoundException;
}
