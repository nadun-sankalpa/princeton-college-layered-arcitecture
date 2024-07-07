package org.example.bo.custom.Impl;

import org.example.bo.custom.DeleteStudentBO;
import org.example.dao.custom.Impl.StudentDAOImpl;
import org.example.dao.custom.StudentDAO;

import java.sql.SQLException;

public class DeleteStudentBOImpl implements DeleteStudentBO {
    StudentDAO studentDAO = new StudentDAOImpl();
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return studentDAO.delete(id);
    }
}
