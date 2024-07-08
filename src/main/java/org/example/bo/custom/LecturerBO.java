package org.example.bo.custom;

import org.example.bo.SuperBO;
import org.example.entity.Lecturer;

import java.sql.SQLException;
import java.util.ArrayList;

public interface LecturerBO extends SuperBO {
    public ArrayList<Lecturer> getAll() throws SQLException, ClassNotFoundException;
}
