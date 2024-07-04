package org.example.bo.custom.Impl;

import org.example.bo.custom.AddCoursesBO;
import org.example.dao.custom.CoursesDAO;
import org.example.dao.custom.Impl.CoursesDAOImpl;
import org.example.entity.Courses;

import java.sql.SQLException;

public class AddCoursesBOImpl implements AddCoursesBO {
    CoursesDAO coursesDAO = new CoursesDAOImpl();

    public boolean add(Courses courses) throws SQLException, ClassNotFoundException {
        return coursesDAO.add(courses);
    }

    public Courses courseIDCheck(String courseID) throws SQLException, ClassNotFoundException {
        return coursesDAO.courseIDCheck(courseID);
    }
}

