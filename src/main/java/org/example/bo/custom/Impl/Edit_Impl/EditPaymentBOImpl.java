package org.example.bo.custom.Impl.Edit_Impl;

import org.example.bo.custom.EditPaymentBO;
import org.example.dao.DAOFactory;
import org.example.dao.custom.PaymentDAO;

import java.sql.SQLException;

public class EditPaymentBOImpl implements EditPaymentBO {
    PaymentDAO paymentDAO = (PaymentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PAYMENT);

    public boolean update(String paymentID, String amount, String date, String studentID, String userID, String courseID) throws SQLException, ClassNotFoundException{
        return paymentDAO.update(paymentID, amount, date, studentID, userID, courseID);
    }
}
