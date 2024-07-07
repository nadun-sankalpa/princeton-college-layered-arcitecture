package org.example.dao.custom.Impl;

import org.example.dao.SQLUtil;
import org.example.dao.custom.BatchDAO;
import org.example.entity.Batch;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BatchDAOImpl implements BatchDAO {
    public ArrayList<Batch> getAll() throws SQLException, ClassNotFoundException {
        ArrayList<Batch> allBatch = new ArrayList<>();
        ResultSet rst = SQLUtil.execute("SELECT * FROM batch");
        while (rst.next()) {
            Batch batch = new Batch(rst.getString("batch_id"), rst.getString("batch_name"), rst.getString("no_of_students"), rst.getString("no_of_lecturers"), rst.getString("main_lecturer"), rst.getString("batch_representer"));
            allBatch.add(batch);
        }
        return allBatch;
    }
    public boolean add(Batch entity) throws SQLException, ClassNotFoundException {
        return SQLUtil.execute("INSERT INTO batch VALUES(?,?,?,?,?,?)", entity.getBatchID(), entity.getBatchName(), entity.getNoOfStudents(), entity.getNoOfLecturers(), entity.getMainLecturer(), entity.getBatchReprsenter());
    }
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return SQLUtil.execute("DELETE FROM batch WHERE batch_id = ?", id);

    }
    public boolean update(String batchId, String batchName, String noOfStudents, String noOfLecturers, String mainLecturer, String batchReprsenter) throws SQLException, ClassNotFoundException {
        return SQLUtil.execute("UPDATE batch SET batch_name = ?, no_of_students = ?, no_of_lecturers = ?,main_lecturer = ?, batch_representer = ?  WHERE batch_id = ?", batchName, noOfStudents, noOfLecturers, mainLecturer, batchReprsenter, batchId);
    }
    public Batch batchIdCheck(String batchID) throws SQLException, ClassNotFoundException {
        ResultSet rst = SQLUtil.execute("SELECT * FROM batch WHERE batch_id = ?", batchID);

            return new Batch(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6));


    }
    public int getBatchCount() throws SQLException, ClassNotFoundException {
        ResultSet rst = SQLUtil.execute("SELECT COUNT(*) AS batch_count FROM batch");
        int batchCount = 0;
        if (rst.next()) {
            batchCount = rst.getInt("batch_count");
        }
        return batchCount;
    }


    @Override
    public boolean generateNewID() throws SQLException, ClassNotFoundException {
        return false;
    }




}
