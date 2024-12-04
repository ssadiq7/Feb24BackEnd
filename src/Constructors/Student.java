package Constructors;

public class Student {
    int studentID;
    String studentName;

    Student() {
        this.studentID = 0;
        this.studentName = null;
    }

    Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    Student(int studentID) {
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    // Copy Constructor
    Student(Student S) {
        this.studentID = S.getStudentID();
        this.studentName = S.studentName;
    }

}
