package org.example.entity;

public class Payment {

    private String paymentID;
    private String amount;
    private String Date;
    private String studentID;
    private String userID;
    private String courseID;


    public Payment() {
    }

    public Payment(String paymentID, String amount, String date, String studentID, String userID, String courseID) {
        this.paymentID = paymentID;
        this.amount = amount;
        this.Date = date;
        this.studentID = studentID;
        this.userID = userID;
        this.courseID = courseID;
    }

    public String getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

}
