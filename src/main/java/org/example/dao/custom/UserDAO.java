package org.example.dao.custom;

import org.example.dao.CrudDAO;
import org.example.entity.User;

import java.sql.SQLException;

public interface UserDAO extends CrudDAO<User> {

    boolean update(User entity) throws SQLException, ClassNotFoundException;
}
