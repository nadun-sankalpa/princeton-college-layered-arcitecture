package org.example.dao.custom;

import org.example.dao.CrudDAO;
import org.example.entity.Payment;

import java.sql.SQLException;

public interface PaymentDAO extends CrudDAO<Payment> {
    boolean savePayment(Payment payment) throws SQLException;
}
