package com.example.oop.abstraction;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class AbstractionTest {
    @Test
    @DisplayName("Circle should calculate its area")
    void testCircleArea() {
        Shape circle = new Circle(10);
        double expected = Math.PI * 100;
        assertEquals(expected, circle.calculateArea(), 0.001);
        assertEquals("I am a shape", circle.getShapeName());
    }
}
