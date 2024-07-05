package org.example.bo.custom;

import java.sql.SQLException;

public interface EditCoursesBO {

    public boolean update(String courseID, String courseName, String courseDuration, String mainLecturer, String courseFee) throws SQLException, ClassNotFoundException;
}
