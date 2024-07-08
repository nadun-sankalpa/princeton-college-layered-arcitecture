package org.example.bo.custom.Impl;

import org.example.bo.custom.LoginBO;
import org.example.dao.custom.Impl.UserDAOImpl;
import org.example.dao.custom.UserDAO;
import org.example.entity.User;

import java.sql.SQLException;

public class LoginBOImpl implements LoginBO {
    UserDAO userDAO = new UserDAOImpl();

    public User checkCredential(String userId, String password) throws SQLException, ClassNotFoundException {
        return userDAO.checkCredential(userId, password);
    }

}
