package org.example.bo.custom.Impl.Edit_Impl;

import org.example.bo.custom.EditBatchBO;
import org.example.dao.DAOFactory;
import org.example.dao.custom.BatchDAO;

import java.sql.SQLException;

public class EditBatchBOImpl implements EditBatchBO {
    BatchDAO batchDAO = (BatchDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.Batch);
    public boolean update(String batchId, String batchName, String noOfStudents, String noOfLecturers, String mainLecturer, String batchReprsenter) throws SQLException, ClassNotFoundException {
        return batchDAO.update(batchId, batchName, noOfStudents, noOfLecturers, mainLecturer, batchReprsenter);
    }

}

