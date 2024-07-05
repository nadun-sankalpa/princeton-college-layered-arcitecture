package org.example.bo.custom.Impl;

import org.example.bo.custom.PaymentBO;
import org.example.dao.DAOFactory;
import org.example.dao.custom.PaymentDAO;
import org.example.entity.Payment;

import java.sql.SQLException;
import java.util.ArrayList;

public class PaymentBOImpl implements PaymentBO {
    PaymentDAO paymentDAO = (PaymentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PAYMENT);
    public ArrayList<Payment> getAll() throws SQLException, ClassNotFoundException{
        return paymentDAO.getAll();
    }
}
