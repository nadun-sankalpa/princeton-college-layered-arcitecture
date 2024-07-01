package org.example.entity;

public class Courses {

    private String courseID;
    private String courseName;
    private String courseDuration;
    private String courseFee;
    private String mainLecturer;


    public Courses() {
    }


    public Courses(String courseID, String courseName, String courseDuration, String courseFee, String mainLecturer) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseDuration = courseDuration;
        this.courseFee = courseFee;
        this.mainLecturer = mainLecturer;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }

    public String getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(String courseFee) {
        this.courseFee = courseFee;
    }

    public String getMainLecturer() {
        return mainLecturer;
    }

    public void setMainLecturer(String mainLecturer) {
        this.mainLecturer = mainLecturer;
    }

}
