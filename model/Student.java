package model;

public class Student implements Comparable<Student> {

    private String regNo;
    private String name;
    private String email;

    public Student() {}

    public Student(String regNo, String name, String email) {
        this.regNo = regNo;
        this.name = name;
        this.email = email;
    }

    public String getRegNo() { return regNo; }
    public void setRegNo(String regNo) { this.regNo = regNo; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public int compareTo(Student other) {
        return this.regNo.compareTo(other.regNo);
    }
}
