package model;

public class Student {
    private String firstName;
    private String lastName;
    private int indexNumber;
    private int attendance;
    private int grade;

    // Konstruktor z warunkiem domyślnym
    public Student(String firstName, String lastName, int indexNumber, int attendance, int grade) {
        this.firstName = (firstName != null && !firstName.isEmpty()) ? firstName : "Unknown";
        this.lastName = (lastName != null && !lastName.isEmpty()) ? lastName : "Unknown";
        this.indexNumber = indexNumber;
        this.attendance = attendance;
        this.grade = attendance < 50 ? 2 : grade;
    }

    // Settery i Gettery
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = (firstName != null && !firstName.isEmpty()) ? firstName : "Unknown";
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = (lastName != null && !lastName.isEmpty()) ? lastName : "Unknown";
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
        if (attendance < 50) {
            this.grade = 2;
        }
    }

    public int getGrade() {
        return grade;
    }
}

