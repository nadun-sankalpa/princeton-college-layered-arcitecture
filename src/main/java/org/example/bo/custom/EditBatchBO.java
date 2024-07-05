package org.example.bo.custom;

import java.sql.SQLException;

public interface EditBatchBO {
    public boolean update(String batchId, String batchName, String noOfStudents, String noOfLecturers, String mainLecturer, String batchReprsenter) throws SQLException, ClassNotFoundException;
}
