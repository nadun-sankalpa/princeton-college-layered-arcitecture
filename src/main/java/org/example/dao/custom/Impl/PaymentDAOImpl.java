package org.example.dao.custom.Impl;

import javafx.scene.chart.XYChart;
import org.example.dao.SQLUtil;
import org.example.dao.custom.PaymentDAO;
import org.example.db.DbConnection;
import org.example.entity.Payment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PaymentDAOImpl implements PaymentDAO {
    public boolean savePayment(Payment payment) throws SQLException {
        String sql = "INSERT INTO payment (payment_id, amount, date, student_id, user_id, course_id) VALUES (?, ?, ?, ?, ?, ?)";
        Connection connection = DbConnection.getInstance().getConnection();
        PreparedStatement checkStmt = connection.prepareStatement(sql);
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setString(1, payment.getPaymentID());
        pstm.setString(2, payment.getAmount());
        pstm.setString(3, payment.getDate());
        pstm.setString(4, payment.getStudentID());
        pstm.setString(5, payment.getUserID());
        pstm.setString(6, payment.getCourseID());
        return pstm.executeUpdate() > 0;
    }

    public static String getnextPaymentId() throws SQLException, ClassNotFoundException {
        String sql = "SELECT payment_id FROM payment ORDER BY payment_id DESC LIMIT 1";
        Connection connection = DbConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);
        ResultSet rst = pstm.executeQuery();
        if (rst.next()) {
            return rst.getString(1);
        }
        return null;
    }

    public ArrayList<Payment> getAll() throws SQLException, ClassNotFoundException {
        ArrayList<Payment> allPayments = new ArrayList<>();
        ResultSet rst = SQLUtil.execute("SELECT * FROM payment");

        while (rst.next()) {
            Payment payment = new Payment(rst.getString("payment_id"), rst.getString("amount"), rst.getString("date"), rst.getString("student_id"), rst.getString("user_id"), rst.getString("course_id"));
            allPayments.add(payment);
        }

        return allPayments;
    }

    public boolean add(Payment entity) throws SQLException, ClassNotFoundException {
        return SQLUtil.execute("INSERT INTO payment VALUES(?,?,?,?,?,?)", entity.getPaymentID(), entity.getAmount(), entity.getDate(), entity.getStudentID(), entity.getUserID(), entity.getCourseID());
    }

    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return SQLUtil.execute("DELETE FROM payment WHERE payment_id = ?", id);
    }
    public boolean update(String paymentID, String amount, String date, String studentID, String userID, String courseID) throws SQLException, ClassNotFoundException {
        return SQLUtil.execute("UPDATE payment SET  payment_id = ?,amount = ?, date = ?, student_id = ?,user_id = ?, course_id = ?  WHERE payment_id = ?", paymentID, amount, date, studentID, userID, courseID, paymentID);
    }

    @Override
    public boolean generateNewID() throws SQLException, ClassNotFoundException {
        return false;
    }
    public Payment paymentIdCheck(String paymentID) throws SQLException, ClassNotFoundException {
        ResultSet rst = SQLUtil.execute("SELECT * FROM payment WHERE payment_id = ?", paymentID);
        return new Payment(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6));
    }

    public  String generateNewId() throws SQLException, ClassNotFoundException {
        ResultSet rst = SQLUtil.execute("SELECT payment_id FROM payment ORDER BY payment_id DESC LIMIT 1");
        if (rst.next()) {
            int id = Integer.parseInt(rst.getString("payment_id"));
            id++;
            return rst.getString(1).split("-")[1];
        }

        return "P-001";
    }
    public  XYChart.Series IncomeChart(XYChart.Series chart) {
        String sql = "SELECT date , SUM(amount) FROM payment GROUP BY date ORDER BY TIMESTAMP(date)";

        try {
            ResultSet rst = org.example.db.DbConnection.getInstance().getConnection().prepareStatement(sql).executeQuery();

            while (rst.next()) {
                chart.getData().add(new XYChart.Data<>(rst.getString(1), rst.getFloat(2)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return chart;
    }

}
