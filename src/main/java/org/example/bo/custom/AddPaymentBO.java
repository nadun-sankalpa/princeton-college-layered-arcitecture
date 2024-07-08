package org.example.bo.custom;

import org.example.bo.SuperBO;
import org.example.entity.Payment;

import java.sql.SQLException;

public interface AddPaymentBO extends SuperBO {

    public boolean add(Payment payment) throws SQLException, ClassNotFoundException;
    public Payment paymentIdCheck(String paymentID) throws SQLException, ClassNotFoundException;
}
