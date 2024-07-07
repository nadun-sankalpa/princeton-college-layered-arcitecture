package org.example.bo.custom.Impl;

import org.example.bo.custom.DeleteBatchBO;
import org.example.dao.custom.BatchDAO;
import org.example.dao.custom.Impl.BatchDAOImpl;

import java.sql.SQLException;

public class DeleteBatchBOImpl implements DeleteBatchBO {
    BatchDAO batchDAO = new BatchDAOImpl();

    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return batchDAO.delete(id);
    }
}
