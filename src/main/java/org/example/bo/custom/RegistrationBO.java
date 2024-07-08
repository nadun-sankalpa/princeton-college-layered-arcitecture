package org.example.bo.custom;

import org.example.bo.SuperBO;
import org.example.entity.User;

import java.sql.SQLException;

public interface RegistrationBO extends SuperBO {
    public boolean add(User user) throws SQLException, ClassNotFoundException;
    public  User checkCredential(String userId, String password) throws SQLException, ClassNotFoundException;
}
