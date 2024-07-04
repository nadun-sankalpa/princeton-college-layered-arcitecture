package org.example.bo.custom;

import org.example.entity.Payment;

import java.sql.SQLException;

public interface AddPaymentBO {
    public boolean add(Payment payment) throws SQLException;
}
