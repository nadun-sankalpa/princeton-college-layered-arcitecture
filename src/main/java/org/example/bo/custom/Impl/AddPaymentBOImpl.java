package org.example.bo.custom.Impl;

import org.example.bo.custom.AddPaymentBO;
import org.example.dao.custom.Impl.PaymentDAOImpl;
import org.example.dao.custom.PaymentDAO;
import org.example.entity.Payment;

import java.sql.SQLException;

public class AddPaymentBOImpl implements AddPaymentBO {
    PaymentDAO paymentDAO = new PaymentDAOImpl();
    public boolean add(Payment payment) throws SQLException, ClassNotFoundException {
        return paymentDAO.add(payment);

    }
    public Payment paymentIdCheck(String paymentID) throws SQLException, ClassNotFoundException{
        return paymentDAO.paymentIdCheck(paymentID);
    }
    public  String generateNewId() throws SQLException, ClassNotFoundException {
        return paymentDAO.generateNewId();
    }
}

