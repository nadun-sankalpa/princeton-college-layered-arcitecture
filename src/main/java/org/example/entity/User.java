package org.example.entity;

public class User {
    private String userId;
    private String userName;
    private String contactNumber;
    private String password;
    private String address;

    public User() {
    }

    public User(String userId, String userName, String contactNumber, String password, String address) {
        this.userId = userId;
        this.userName = userName;
        this.contactNumber = contactNumber;
        this.password = password;
        this.address = address;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
