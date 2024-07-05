package org.example.dao.custom;

import org.example.dao.CrudDAO;
import org.example.entity.Student;

import java.sql.SQLException;

public interface StudentDAO extends CrudDAO<Student> {
    public Student checkStudentId(String id) throws SQLException, ClassNotFoundException;
    public  boolean update(String studentID, String name, String address, String contactNo, String nicNo, String userID) throws SQLException, ClassNotFoundException;
}
