package org.example.bo.custom.Impl;

import org.example.bo.custom.DeleteLectureBO;
import org.example.dao.custom.Impl.LecturerDAOImpl;
import org.example.dao.custom.LecturerDAO;

import java.sql.SQLException;

public class DeleteLecturerBOImpl implements DeleteLectureBO {
    LecturerDAO lecturerDAO = new LecturerDAOImpl();
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return lecturerDAO.delete(id);
    }
}
