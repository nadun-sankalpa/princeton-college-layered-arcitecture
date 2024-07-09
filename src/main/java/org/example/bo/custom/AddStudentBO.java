package org.example.bo.custom;

import org.example.bo.SuperBO;
import org.example.entity.Payment;
import org.example.entity.Student;

import java.sql.SQLException;

public interface AddStudentBO extends SuperBO {
    public  boolean studentRegistration(Student student, Payment payment) throws SQLException, ClassNotFoundException;
    public  String generateNewId() throws SQLException, ClassNotFoundException;
}
