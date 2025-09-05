package com.example.oop.encapsulation;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private Student student;

    @BeforeEach
    void setUp() {
        student = new Student(101, "Alice");
    }

    @Test
    @DisplayName("setGrade should update grade with a valid value")
    void testSetGradeValid() {
        student.setGrade('A');
        assertEquals('A', student.getGrade());
    }

    @Test
    @DisplayName("setGrade should not update with an invalid value")
    void testSetGradeInvalid() {
        student.setGrade('Z');
        assertEquals('N', student.getGrade());
    }
}
