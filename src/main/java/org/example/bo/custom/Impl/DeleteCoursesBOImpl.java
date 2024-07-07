package org.example.bo.custom.Impl;

import org.example.bo.custom.DeleteCoursesBO;
import org.example.dao.custom.CoursesDAO;
import org.example.dao.custom.Impl.CoursesDAOImpl;

import java.sql.SQLException;

public class DeleteCoursesBOImpl implements DeleteCoursesBO {
    CoursesDAO coursesDAO = new CoursesDAOImpl();
     public boolean delete(String id) throws SQLException, ClassNotFoundException {
         return coursesDAO.delete(id);
     }
}
