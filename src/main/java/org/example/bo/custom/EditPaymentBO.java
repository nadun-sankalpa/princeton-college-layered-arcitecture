package org.example.bo.custom;

import java.sql.SQLException;

public interface EditPaymentBO {

    public boolean update(String paymentID, String amount, String date, String studentID, String userID, String courseID) throws SQLException, ClassNotFoundException;
}
