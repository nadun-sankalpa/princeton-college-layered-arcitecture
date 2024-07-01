package org.example.entity;

public class Exams {

    private String examID;
    private String examName;
    private String lectureID ;

    private String time;
    private String Date;


    public Exams() {
    }

    public Exams(String examID, String examName, String lectureID, String time, String date) {
        this.examID = examID;
        this.examName = examName;
        this.lectureID = lectureID;
        this.time = time;
        this.Date = date;
    }

    public String getExamID() {
        return examID;
    }

    public void setExamID(String examID) {
        this.examID = examID;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public String getLectureID() {
        return lectureID;
    }

    public void setLectureID(String lectureID) {
        this.lectureID = lectureID;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}
