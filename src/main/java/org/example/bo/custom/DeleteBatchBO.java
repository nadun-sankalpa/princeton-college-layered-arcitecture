package org.example.bo.custom;

import java.sql.SQLException;

public interface DeleteBatchBO {
    public boolean delete(String id) throws SQLException, ClassNotFoundException;
}
