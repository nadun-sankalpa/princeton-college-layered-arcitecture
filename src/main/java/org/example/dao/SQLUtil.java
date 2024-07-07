package org.example.dao;


import org.example.db.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SQLUtil {
    public static <T> T execute(String sql, Object... args) throws SQLException, ClassNotFoundException {
        Connection connection = DbConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);
        for (int i = 0; i < args.length; i++) {
            pstm.setObject(i + 1, args[i]);
        }
        if (sql.startsWith("SELECT")) {
            return (T) pstm.executeQuery();
        } else {
            int affectedRows = pstm.executeUpdate();
            // Returning a Boolean indicating whether the update was successful
            return (T) Boolean.valueOf(affectedRows > 0);
        }
    }
}




