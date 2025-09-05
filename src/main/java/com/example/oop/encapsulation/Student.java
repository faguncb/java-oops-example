package com.example.oop.encapsulation;

public class Student {
    private final int studentId;
    private final String firstName;
    private char grade;

    public Student(int studentId, String firstName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.grade = 'N';
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char newGrade) {
        if (newGrade == 'A' || newGrade == 'B' ||
                newGrade == 'C' || newGrade == 'D' ||
                newGrade == 'F') {
            this.grade = newGrade;
        } else {
            System.out.println("Invalid grade.");
        }
    }
}
