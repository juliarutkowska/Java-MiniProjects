package test;
import model.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("Anna", "Nowak", 12345, 75, 4);
        Student s2 = new Student("", "", 23456, 45, 5);
        Student s3 = new Student("Piotr", "Kowalski", 34567, 90, 5);

        System.out.println("Student 1: " + s1.getFirstName() + " " + s1.getLastName() + " Grade: " + s1.getGrade());
        System.out.println("Student 2: " + s2.getFirstName() + " " + s2.getLastName() + " Grade: " + s2.getGrade());
        System.out.println("Student 3: " + s3.getFirstName() + " " + s3.getLastName() + " Grade: " + s3.getGrade());
    }
}
