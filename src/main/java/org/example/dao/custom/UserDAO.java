package org.example.dao.custom;

import org.example.dao.CrudDAO;
import org.example.entity.User;

import java.sql.SQLException;

public interface UserDAO extends CrudDAO<User> {
    public  User checkCredential(String userId, String password) throws SQLException, ClassNotFoundException;

    boolean update(User entity) throws SQLException, ClassNotFoundException;
}
