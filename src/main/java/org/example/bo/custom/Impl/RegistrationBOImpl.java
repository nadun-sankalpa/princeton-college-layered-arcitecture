package org.example.bo.custom.Impl;

import org.example.bo.custom.RegistrationBO;
import org.example.dao.DAOFactory;
import org.example.dao.custom.UserDAO;
import org.example.entity.User;

import java.sql.SQLException;

public class RegistrationBOImpl implements RegistrationBO {
    UserDAO userDAO = (UserDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.User);
    public boolean add(User user) throws SQLException, ClassNotFoundException{
        return userDAO.add(user);
    }
    public  User checkCredential(String userId, String password) throws SQLException, ClassNotFoundException{
        return userDAO.checkCredential(userId, password);
    }
}
