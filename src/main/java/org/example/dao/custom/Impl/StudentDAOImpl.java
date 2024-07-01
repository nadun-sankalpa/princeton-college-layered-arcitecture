package org.example.dao.custom.Impl;

import org.example.dao.SQLUtil;
import org.example.dao.custom.StudentDAO;
import org.example.entity.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDAOImpl implements StudentDAO {
    public ArrayList<Student> getAll() throws SQLException, ClassNotFoundException {
        ArrayList<Student> allStudents = new ArrayList<>();
        ResultSet rst = SQLUtil.execute("SELECT * FROM student");

        while (rst.next()) {
            Student student = new Student(rst.getString("student_id"), rst.getString("name"), rst.getString("address"), rst.getString("contact_no"), rst.getString("NIC"), rst.getString("user_id"));
            allStudents.add(student);
        }
        return allStudents;
    }

    public boolean add(Student entity) throws SQLException, ClassNotFoundException {
        return SQLUtil.execute("INSERT INTO student VALUES(?,?,?,?,?,?)", entity.getStudentID(), entity.getName(), entity.getAddress(), entity.getContactNo(), entity.getNicNo(), entity.getUserID());
    }

    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return SQLUtil.execute("DELETE FROM student WHERE student_id = ?", id);
    }
    public boolean update(Student entity) throws SQLException, ClassNotFoundException {
        return SQLUtil.execute("UPDATE student SET name = ?,address = ?,contact_no = ?,NIC = ?,user_id = ?  WHERE student_id = ?", entity.getName(), entity.getAddress(), entity.getContactNo(), entity.getNicNo(), entity.getUserID(), entity.getStudentID());
    }

    @Override
    public boolean generateNewID() throws SQLException, ClassNotFoundException {
        return false;
    }
}

