package org.example.bo.custom;

import org.example.bo.SuperBO;
import org.example.entity.User;

import java.sql.SQLException;

public interface LoginBO extends SuperBO {
    public User checkCredential(String userId, String password) throws SQLException, ClassNotFoundException;
}
