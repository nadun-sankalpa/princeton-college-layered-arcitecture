package org.example.bo.custom;

import java.sql.SQLException;

public interface DeletePaymentBO {
    public boolean delete(String id) throws SQLException, ClassNotFoundException;
}
