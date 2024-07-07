package org.example.dao.custom;

import org.example.dao.CrudDAO;
import org.example.entity.Student;

import java.sql.SQLException;
import java.util.ArrayList;

public interface StudentDAO extends CrudDAO<Student> {
    public int getStudentCount() throws SQLException, ClassNotFoundException;
    public ArrayList<Student> getAll() throws SQLException, ClassNotFoundException;
    public Student checkStudentId(String id) throws SQLException, ClassNotFoundException;
    public  boolean update(String studentID, String name, String address, String contactNo, String nicNo, String userID) throws SQLException, ClassNotFoundException;
}
