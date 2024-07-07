package org.example.dao.custom.Impl;

import org.example.dao.SQLUtil;
import org.example.dao.custom.UserDAO;
import org.example.entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDAOImpl implements UserDAO {
    public static User checkCredential(String userId, String password) throws SQLException, ClassNotFoundException {
        ResultSet rst = SQLUtil.execute("SELECT * FROM user WHERE user_id = ? AND password = ?", userId, password);
        if (rst.next()) { // Ensure the cursor is moved to the first row
            return new User(rst.getString("user_id"),
                    rst.getString("name"),
                    rst.getString("contact_no"),
                    rst.getString("password"),
                    rst.getString("address"));
        } else {
            return null; // Return null if no user is found
        }
    }

    public ArrayList<User> getAll() {
        return null;
    }

    public boolean add(User user) throws SQLException, ClassNotFoundException {
        return SQLUtil.execute("INSERT INTO user VALUES(?,?,?,?,?)",
                user.getUserId(),
                user.getUserName(),
                user.getContactNumber(),
                user.getPassword(),
                user.getAddress());
    }

    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return SQLUtil.execute("DELETE FROM user WHERE user_id = ?", id);
    }

    @Override
    public boolean update(User entity) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean generateNewID() throws SQLException, ClassNotFoundException {
        return false;
    }
}
