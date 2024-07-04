package org.example.dao.custom;

import org.example.dao.CrudDAO;
import org.example.entity.Courses;

import java.sql.SQLException;

public interface CoursesDAO extends CrudDAO<Courses> {
    public  boolean add(Courses entity) throws SQLException, ClassNotFoundException;

    public Courses courseIDCheck(String courseID) throws SQLException, ClassNotFoundException;

}
