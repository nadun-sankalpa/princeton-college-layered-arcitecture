package org.example.entity;

public class Student {

    private String studentID;
    private String name;
    private String contactNo;
    private String address;
    private String nicNo;
    private String userID;

    public Student(String studentId, String studentName, String contactNo, String nicNumber, String address) {
    }

    public Student(String studentID, String name, String contactNo, String address, String nicNo, String userID) {
        this.studentID = studentID;
        this.name = name;
        this.contactNo = contactNo;
        this.address = address;
        this.nicNo = nicNo;
        this.userID = userID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNicNo() {
        return nicNo;
    }

    public void setNicNo(String nicNo) {
        this.nicNo = nicNo;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", name='" + name + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", address='" + address + '\'' +
                ", nicNo='" + nicNo + '\'' +
                ", userID='" + userID + '\'' +
                '}';
    }   }
