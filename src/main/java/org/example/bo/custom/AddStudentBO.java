package org.example.bo.custom;

import org.example.entity.Payment;
import org.example.entity.Student;

import java.sql.SQLException;

public interface AddStudentBO {
    public  boolean studentRegistration(Student student, Payment payment) throws SQLException, ClassNotFoundException;
}
