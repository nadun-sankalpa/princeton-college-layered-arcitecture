package org.example.bo.custom;

import org.example.bo.SuperBO;

import java.sql.SQLException;

public interface EditBatchBO extends SuperBO {
    public boolean update(String batchId, String batchName, String noOfStudents, String noOfLecturers, String mainLecturer, String batchReprsenter) throws SQLException, ClassNotFoundException;
}
