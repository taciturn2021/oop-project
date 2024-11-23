package models;

import java.util.ArrayList;

public class Teacher extends Person{
    private int teacherID;
    private String department;
    private String specialization;
    private ArrayList<Course> coursesTaught;

    public Teacher(){
        this(0, "", "", new ArrayList<Course>());
    }
    public Teacher(int teacherID, String department, String specialization, ArrayList<Course> coursesTaught){
        this.teacherID = teacherID;
        this.department = department;
        this.specialization = specialization;
        this.coursesTaught = coursesTaught;
    }
    // Functionality

    // Implement here

    // Getters and Setters


    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public ArrayList<Course> getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(ArrayList<Course> coursesTaught) {
        this.coursesTaught = coursesTaught;
    }
}


