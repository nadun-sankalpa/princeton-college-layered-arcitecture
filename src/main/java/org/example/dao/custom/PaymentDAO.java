package org.example.dao.custom;

import org.example.dao.CrudDAO;
import org.example.entity.Payment;

import java.sql.SQLException;

public interface PaymentDAO extends CrudDAO<Payment> {
    public Payment paymentIdCheck(String paymentID) throws SQLException, ClassNotFoundException;
    boolean savePayment(Payment payment) throws SQLException;
}
