package org.example.bo.custom.Impl;

import org.example.bo.custom.AddBatchBO;
import org.example.dao.custom.BatchDAO;
import org.example.dao.custom.Impl.BatchDAOImpl;
import org.example.entity.Batch;

import java.sql.SQLException;

public class AddBatchBOImpl implements AddBatchBO {
    BatchDAO batchDAO = new BatchDAOImpl();

public Batch batchIdCheck(String batchID) throws SQLException, ClassNotFoundException {
    return batchDAO.batchIdCheck(batchID);
}
public boolean add(Batch batch) throws SQLException, ClassNotFoundException {
    try {
        return batchDAO.add(batch);
    } catch (SQLException | ClassNotFoundException e) {
        e.printStackTrace();
        return false;
    }
}

}
