package org.example.bo.custom.Impl.Edit_Impl;

import org.example.bo.custom.EditCoursesBO;
import org.example.dao.DAOFactory;
import org.example.dao.custom.CoursesDAO;

import java.sql.SQLException;

public class EditCoursesBOImpl implements EditCoursesBO {
    CoursesDAO coursesDAO = (CoursesDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.COURSES);
    public boolean update(String courseID, String courseName, String courseDuration, String mainLecturer, String courseFee) throws SQLException, ClassNotFoundException{
        return coursesDAO.update(courseID, courseName, courseDuration, mainLecturer, courseFee);
    }
}
