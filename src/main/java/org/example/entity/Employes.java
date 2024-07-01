package org.example.entity;

public class Employes {

    private String employeeID;
    private String Name;
    private String contactNo;
    private String Address;
    private String nicNo;


    public Employes() {
    }

    public Employes(String employeeID, String name, String contactNo, String address, String nicNo) {
        this.employeeID = employeeID;
        this.Name = name;
        this.contactNo = contactNo;
        this.Address = address;
        this.nicNo = nicNo;
    }


    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
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
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public String getNicNo() {
        return nicNo;
    }

    public void setNicNo(String nicNo) {
        this.nicNo = nicNo;
    }

    @Override
    public String toString() {
        return "Employes{" + "employeeID=" + employeeID + ", Name=" + Name + ", contactNo=" + contactNo + ", Address=" + Address + ", nicNo=" + nicNo + '}';
    }


}
