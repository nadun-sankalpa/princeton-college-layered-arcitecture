package org.example.bo.custom.Impl.Edit_Impl;

import org.example.bo.custom.EditLecturerBO;
import org.example.dao.DAOFactory;
import org.example.dao.custom.LecturerDAO;

import java.sql.SQLException;

public class EditLecturerBOImpl implements EditLecturerBO {
    LecturerDAO lecturerDAO = (LecturerDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.LECTURER);

    public boolean update(String lecturerID, String name, String contactNo, String address, String nicNo) throws SQLException, ClassNotFoundException{
        return lecturerDAO.update(lecturerID, name, contactNo, address, nicNo);
    }
}
