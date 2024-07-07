package org.example.bo.custom.Impl;

import org.example.bo.custom.StudentBO;
import org.example.dao.DAOFactory;
import org.example.dao.custom.StudentDAO;
import org.example.entity.Student;

import java.sql.SQLException;
import java.util.ArrayList;

public class StudentBOImpl implements StudentBO {
    StudentDAO studentDAO = (StudentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.Student);
    public ArrayList<Student> getAll() throws SQLException, ClassNotFoundException{
        return studentDAO.getAll();
    }
}
