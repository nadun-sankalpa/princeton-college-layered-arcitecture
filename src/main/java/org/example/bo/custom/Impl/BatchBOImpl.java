package org.example.bo.custom.Impl;

import org.example.bo.custom.BatchBO;
import org.example.dao.DAOFactory;
import org.example.dao.custom.BatchDAO;
import org.example.entity.Batch;

import java.sql.SQLException;
import java.util.ArrayList;

public class BatchBOImpl implements BatchBO {
    BatchDAO batchDAO = (BatchDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.Batch);
    public ArrayList<Batch> getAll() throws SQLException, ClassNotFoundException {
        return batchDAO.getAll();
    }

}
