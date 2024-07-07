package org.example.entity;

public class Exams {

    private String examID;
    private String examName;
    private String Date;
    private String time;
    private String lectureID ;


    public Exams() {
    }

    public Exams(String examID, String examName, String time, String date, String lectureID) {
        this.examID = examID;
        this.examName = examName;
        this.Date = date;
        this.time = time;
        this.lectureID = lectureID;
    }

    public String getExamID() {return examID;}

    public void setExamID(String examID) {
        this.examID = examID;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        this.Date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


    public String getLectureID() {
        return lectureID;
    }

    public void setLectureID(String lectureID) {
        this.lectureID = lectureID;
    }
}
