package org.example.bo.custom;

import org.example.entity.Payment;

import java.sql.SQLException;
import java.util.ArrayList;

public interface PaymentBO {
    public ArrayList<Payment> getAll() throws SQLException, ClassNotFoundException;
}
