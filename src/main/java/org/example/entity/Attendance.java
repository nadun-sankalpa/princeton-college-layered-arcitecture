package org.example.entity;

public class Attendance {

    private String attendanceID;
    private String studentID;
    private String in_time;
    private String out_time;
    private String date;
   private String userID;

    public Attendance(){

    }

    public Attendance(String attendanceID, String studentID, String in_time, String out_time, String date, String userID) {
        this.attendanceID = attendanceID;
        this.studentID = studentID;
        this.in_time = in_time;
        this.out_time = out_time;
        this.date = date;
        this.userID = userID;
    }

    public String getAttendanceID() {
        return attendanceID;
    }

    public void setAttendanceID(String attendanceID) {
        this.attendanceID = attendanceID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getIn_time() {
        return in_time;
    }

    public void setIn_time(String in_time) {
        this.in_time = in_time;
    }

    public String getOut_time() {
        return out_time;
    }
    public String setOut_time(String out_time) {
        this.out_time = out_time;
        return out_time;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }



}
