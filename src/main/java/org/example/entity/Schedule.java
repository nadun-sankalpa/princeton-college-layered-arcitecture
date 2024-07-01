package org.example.entity;

public class Schedule {

    private String scheduleID;
    private String moduleName;
    private String date;
    private String time;
    private String lectureID;

    public Schedule() {
    }

    public Schedule(String scheduleID, String moduleName, String date, String time, String lectureID) {
        this.scheduleID = scheduleID;
        this.moduleName = moduleName;
        this.date = date;
        this.time = time;
        this.lectureID = lectureID;
    }

    public String getScheduleID() {
        return scheduleID;
    }

    public void setScheduleID(String scheduleID) {
        this.scheduleID = scheduleID;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLecturerID() {
        return lectureID;
    }

    public void setLecturerID(String lectureID) {
        this.lectureID = lectureID;
    }

}
