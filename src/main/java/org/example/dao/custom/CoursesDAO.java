package org.example.dao.custom;

import org.example.dao.CrudDAO;
import org.example.entity.Courses;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CoursesDAO extends CrudDAO<Courses> {
    public ArrayList<Courses> getAll() throws SQLException, ClassNotFoundException;
    public  boolean add(Courses entity) throws SQLException, ClassNotFoundException;
    public boolean update(String courseID, String courseName, String courseDuration, String mainLecturer, String courseFee) throws SQLException, ClassNotFoundException;

    public Courses courseIDCheck(String courseID) throws SQLException, ClassNotFoundException;

}
