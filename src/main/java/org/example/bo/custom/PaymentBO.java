package org.example.bo.custom;

import org.example.bo.SuperBO;
import org.example.entity.Payment;

import java.sql.SQLException;
import java.util.ArrayList;

public interface PaymentBO extends SuperBO {
    public ArrayList<Payment> getAll() throws SQLException, ClassNotFoundException;

}
