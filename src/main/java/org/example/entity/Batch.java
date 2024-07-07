package org.example.entity;

public class Batch {

    private String batchID;
    private String batchName;
    private String noOfStudents;
    private String noOfLecturers;
    private String mainLecturer;
    private String batchRepresenter;

    public Batch(){
    }
    public Batch(String batchID, String batchName, String noOfStudents, String noOfLecturers, String mainLecturer, String batchReprsenter) {
        this.batchID = batchID;
        this.batchName = batchName;
        this.noOfStudents = String.valueOf(noOfStudents);
        this.noOfLecturers = String.valueOf(noOfLecturers);
        this.mainLecturer = mainLecturer;
        this.batchRepresenter = batchReprsenter;
    }

    public String getBatchID() {
        return batchID;
    }

    public void setBatchID(String batchID) {
        this.batchID = batchID;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = String.valueOf(noOfStudents);
    }

    public String getNoOfLecturers() {
        return noOfLecturers;
    }

    public void setNoOfLecturers(int noOfLecturers) {
        this.noOfLecturers = String.valueOf(noOfLecturers);
    }

    public String getMainLecturer() {
        return mainLecturer;
    }

    public void setMainLecturer(String mainLecturer) {
        this.mainLecturer = mainLecturer;
    }

    public String getBatchRepresenter() {
        return batchRepresenter;
    }

    public void setBatchRepresenter(String batchReprsenter) {
        this.batchRepresenter = batchReprsenter;
    }

}
