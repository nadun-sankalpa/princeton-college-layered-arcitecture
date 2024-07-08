package org.example.bo.custom;

import org.example.bo.SuperBO;

import java.sql.SQLException;

public interface EditPaymentBO extends SuperBO {

    public boolean update(String paymentID, String amount, String date, String studentID, String userID, String courseID) throws SQLException, ClassNotFoundException;
}
