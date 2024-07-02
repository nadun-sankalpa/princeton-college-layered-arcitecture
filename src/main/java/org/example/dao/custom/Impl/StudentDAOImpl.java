package org.example.dao.custom.Impl;

import javafx.scene.control.Alert;
import org.example.dao.SQLUtil;
import org.example.dao.custom.StudentDAO;
import org.example.db.DbConnection;
import org.example.entity.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDAOImpl implements StudentDAO {
    public static boolean saveStudent(Student student) throws SQLException {
        String sqlCheck = "SELECT * FROM student WHERE student_id = ?";
        Connection connection = DbConnection.getInstance().getConnection();
        PreparedStatement checkStmt = connection.prepareStatement(sqlCheck);
        checkStmt.setString(1, student.getStudentID());
        ResultSet rs = checkStmt.executeQuery();

        if (rs.next()) {
            // Student ID already exists, handle appropriately
            new Alert(Alert.AlertType.ERROR, "Student ID already exists!").show();
        } else {
            // Insert new student record
            String sql = "INSERT INTO student (student_id, name, address, contact_no, NIC, user_id) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pstm = connection.prepareStatement(sql);
            pstm.setString(1, student.getStudentID());
            pstm.setString(2, student.getName());
            pstm.setString(3, student.getAddress());
            pstm.setString(4, student.getContactNo());
            pstm.setString(5, student.getNicNo());
            pstm.setString(6, student.getUserID());

            return pstm.executeUpdate() > 0;
        }
        return false;
    }


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
    public  boolean update(Student entity) throws SQLException, ClassNotFoundException {
        return SQLUtil.execute("UPDATE student SET name = ?,address = ?,contact_no = ?,NIC = ?,user_id = ?  WHERE student_id = ?", entity.getName(), entity.getAddress(), entity.getContactNo(), entity.getNicNo(), entity.getUserID(), entity.getStudentID());
    }

    @Override
    public boolean generateNewID() throws SQLException, ClassNotFoundException {
        return false;
    }
}

