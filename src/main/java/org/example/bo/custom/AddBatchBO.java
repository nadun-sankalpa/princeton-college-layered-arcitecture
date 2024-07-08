package org.example.bo.custom;

import org.example.bo.SuperBO;
import org.example.entity.Batch;

import java.sql.SQLException;

public interface AddBatchBO extends SuperBO {
    public  boolean add(Batch batch) throws SQLException , ClassNotFoundException;


    public  Batch batchIdCheck(String batchID) throws SQLException, ClassNotFoundException;
}
