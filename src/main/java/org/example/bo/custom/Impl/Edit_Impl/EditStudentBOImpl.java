package org.example.bo.custom.Impl.Edit_Impl;

import org.example.bo.custom.EditStudentBO;
import org.example.dao.DAOFactory;
import org.example.dao.custom.StudentDAO;

import java.sql.SQLException;

public class EditStudentBOImpl implements EditStudentBO {
    StudentDAO studentDAO = (StudentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.STUDENT);

    public boolean update(String studentID, String name, String address, String contactNo, String nicNo, String userID) throws SQLException, ClassNotFoundException{
        return studentDAO.update(studentID, name, address, contactNo, nicNo, userID);
    }
}
