package org.example.bo.custom.Impl;

import org.example.bo.custom.LecturerBO;
import org.example.dao.DAOFactory;
import org.example.dao.custom.LecturerDAO;
import org.example.entity.Lecturer;

import java.sql.SQLException;
import java.util.ArrayList;

public class LecturerBOImpl implements LecturerBO{
    LecturerDAO lecturerDAO = (LecturerDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.Lecture);
    public ArrayList<Lecturer> getAll() throws SQLException, ClassNotFoundException{
        return lecturerDAO.getAll();
    }
}
