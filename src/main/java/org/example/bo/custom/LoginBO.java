package org.example.bo.custom;

import org.example.entity.User;

import java.sql.SQLException;

public interface LoginBO {
    public User checkCredential(String userId, String password) throws SQLException, ClassNotFoundException;
}
