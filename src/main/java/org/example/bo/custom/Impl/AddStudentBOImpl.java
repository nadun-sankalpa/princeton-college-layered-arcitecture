package org.example.bo.custom.Impl;

import org.example.bo.custom.AddStudentBO;
import org.example.dao.custom.Impl.PaymentDAOImpl;
import org.example.dao.custom.Impl.StudentDAOImpl;
import org.example.dao.custom.Impl.UserDAOImpl;
import org.example.dao.custom.PaymentDAO;
import org.example.dao.custom.StudentDAO;
import org.example.dao.custom.UserDAO;
import org.example.db.DbConnection;
import org.example.dto.PaymentDTO;
import org.example.dto.StudentDTO;
import org.example.entity.Payment;
import org.example.entity.Student;

import java.sql.Connection;
import java.sql.SQLException;

public class AddStudentBOImpl implements AddStudentBO {
    UserDAO userDAO = new UserDAOImpl();
     StudentDAO studentDAO = new StudentDAOImpl();
     PaymentDAO paymentDAO = new PaymentDAOImpl();


    public static boolean studentRegistration(StudentDTO studentDTO, PaymentDTO paymentDTO, String userID, String initialPayment) throws SQLException, ClassNotFoundException {
        Connection connection = DbConnection.getInstance().getConnection();
        connection.setAutoCommit(false);
        try {
            boolean isStudentSaved = studentDAO.add(student);
            if(isStudentSaved) {
                String studentID = StudentDAO.getNextId();
                boolean isPayementSaved = paymentDAO.add(payment);
                if (isPayementSaved) {
                    connection.commit();
                    return true;
                }
            }
            connection.rollback();
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            connection.rollback();
            return false;
        }finally {
            connection.setAutoCommit(true);
        }
    }


    public static boolean studentRegistration(Student student, Payment payment) {

    }
}
