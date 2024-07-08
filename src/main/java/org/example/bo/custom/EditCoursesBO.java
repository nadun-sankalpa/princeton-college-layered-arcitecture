package org.example.bo.custom;

import org.example.bo.SuperBO;

import java.sql.SQLException;

public interface EditCoursesBO extends SuperBO {

    public boolean update(String courseID, String courseName, String courseDuration, String mainLecturer, String courseFee) throws SQLException, ClassNotFoundException;
}
