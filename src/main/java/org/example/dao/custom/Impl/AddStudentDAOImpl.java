package org.example.dao.custom.Impl;

import org.example.dao.custom.AddStudentDAO;
import org.example.db.DbConnection;
import org.example.entity.Payment;
import org.example.entity.Student;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class AddStudentDAOImpl implements AddStudentDAO {
    public static boolean studentRegistration(Student student, Payment payment) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();
        connection.setAutoCommit(false);
        try {
            boolean isStudentSaved = StudentDAOImpl.addStudent(student);
            if(isStudentSaved) {
                boolean isPayementSaved = PaymentDAOImpl.savePayment(payment);
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

    @Override
    public ArrayList<AddStudentDAO> getAll() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public boolean add(AddStudentDAO entity) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean update(AddStudentDAO entity) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean generateNewID() throws SQLException, ClassNotFoundException {
        return false;
    }
}
