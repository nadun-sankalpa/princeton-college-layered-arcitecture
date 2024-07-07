package org.example.bo.custom.Impl;

import org.example.bo.custom.DeletePaymentBO;
import org.example.dao.custom.Impl.PaymentDAOImpl;
import org.example.dao.custom.PaymentDAO;

import java.sql.SQLException;

public class DeletePaymentBOImpl implements DeletePaymentBO {
 PaymentDAO paymentDAO = new PaymentDAOImpl();
 public boolean delete(String id) throws SQLException, ClassNotFoundException {
     return paymentDAO.delete(id);
 }
    }

