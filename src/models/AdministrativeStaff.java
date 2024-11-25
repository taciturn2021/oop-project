package models;

import java.util.List;

public class AdministrativeStaff extends Person {
    private int staffID;
    private String role;
    private String department;

    public AdministrativeStaff(){
        this(0, "", "");
    }

    public AdministrativeStaff(int staffID, String role, String department){
        this.staffID = staffID;
        this.role = role;
        this.department = department;
    }
    // Functionality

    public void generateReport( List<Person> people ){
       super.generateReport(people);
    }

    public String toString(){
        return getStaffID()+ " " + getRole() + " " + getDepartment();
    }
    // Getters and Setters


    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
