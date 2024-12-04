package Constructors;

public class Main {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);

        Student student1 = new Student(101, "firstStudent");

        Student student2 = new Student(102);
        student2.studentName = "secondStudent";

        Student student3 = new Student();
        student3.studentID = 103;
        student3.studentName = "thirdStudent";

        Student setterStudent4 = new Student();
        setterStudent4.setStudentID(104); // Setter for studentID
        setterStudent4.studentName = "setterStudent4"; // No explicit setter for studentName

        Student student1Copy = student1; // Shallow Copy (student1Copy starts referring to student1's address)

        Student student2Copy = new Student();
        student2Copy.studentID = student2.studentID; // Deep Copy
        student2Copy.studentName = student2.studentName; // Deep Copy

        Student student3DeepCopy = new Student(student3); // Deep Copy using Copy Constructor
    }
}
