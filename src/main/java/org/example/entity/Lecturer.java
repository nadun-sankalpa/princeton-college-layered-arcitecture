package org.example.entity;

public class Lecturer {

    private String LecturerID;
    private String Name;
    private String contactNo;
    private String address;
    private String nicNo;


    public Lecturer() {
    }

    public Lecturer(String LecturerID, String name, String contactNo, String address, String nicNo) {
        this.LecturerID = LecturerID;
        this.Name = name;
        this.contactNo = contactNo;
        this.address = address;
        this.nicNo = nicNo;
    }
    public String getLecturerID() {
        return LecturerID;
    }

    public void setLecturerID(String LecturerID) {
        this.LecturerID = LecturerID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
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

}
