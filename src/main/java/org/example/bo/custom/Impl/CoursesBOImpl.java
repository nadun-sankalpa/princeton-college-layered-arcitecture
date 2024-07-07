package org.example.bo.custom.Impl;

import org.example.bo.custom.CoursesBO;
import org.example.dao.DAOFactory;
import org.example.dao.custom.CoursesDAO;
import org.example.entity.Courses;

import java.sql.SQLException;
import java.util.ArrayList;

public class CoursesBOImpl implements CoursesBO {
    CoursesDAO coursesDAO = (CoursesDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.Course);
    public ArrayList<Courses> getAll() throws SQLException, ClassNotFoundException{
        return coursesDAO.getAll();
    }
}
