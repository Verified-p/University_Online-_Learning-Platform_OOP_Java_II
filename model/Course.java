package model;

import java.util.ArrayList;

public class Course {

    private String courseCode;
    private String title;
    private ArrayList<Student> students;

    // Default constructor
    public Course() {
        students = new ArrayList<>();
    }

    // Overloaded constructor
    public Course(String courseCode, String title) {
        this.courseCode = courseCode;
        this.title = title;
        students = new ArrayList<>();
    }

    // Enroll a student
    public void enrollStudent(Student s) {
        if (s != null) {
            students.add(s);
        }
    }

    // Show course details (for polymorphism)
    public void showDetails() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Title: " + title);
    }

    // Getters and setters (Encapsulation)
    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
