package org.example.dao.custom;

import org.example.dao.CrudDAO;
import org.example.entity.Batch;

import java.sql.SQLException;
import java.util.ArrayList;

public interface BatchDAO extends CrudDAO<Batch> {
    public ArrayList<Batch> getAll() throws SQLException, ClassNotFoundException;
    public  boolean add(Batch batch) throws SQLException, ClassNotFoundException;
    public boolean update(String batchId, String batchName, String noOfStudents, String noOfLecturers, String mainLecturer, String batchReprsenter) throws SQLException, ClassNotFoundException;
    public Batch batchIdCheck(String batchID) throws SQLException, ClassNotFoundException;
}

