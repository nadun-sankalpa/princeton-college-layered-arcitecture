package org.example.entity;

public class Batch {

    private String batchID;
    private String batchName;
    private int noOfStudents;
    private int noOfLecturers;
    private String mainLecturer;
    private String batchReprsenter;
    public Batch(String batchId, String batchName, String noOfStudents, String noOfLecturers, String mainLecturer, String batchRepresenter){
    }
    public Batch(String batchID, String batchName, int noOfStudents, int noOfLecturers, String mainLecturer, String batchReprsenter) {
        this.batchID = batchID;
        this.batchName = batchName;
        this.noOfStudents = noOfStudents;
        this.noOfLecturers = noOfLecturers;
        this.mainLecturer = mainLecturer;
        this.batchReprsenter = batchReprsenter;
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

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public int getNoOfLecturers() {
        return noOfLecturers;
    }

    public void setNoOfLecturers(int noOfLecturers) {
        this.noOfLecturers = noOfLecturers;
    }

    public String getMainLecturer() {
        return mainLecturer;
    }

    public void setMainLecturer(String mainLecturer) {
        this.mainLecturer = mainLecturer;
    }

    public String getBatchReprsenter() {
        return batchReprsenter;
    }

    public void setBatchReprsenter(String batchReprsenter) {
        this.batchReprsenter = batchReprsenter;
    }

}
