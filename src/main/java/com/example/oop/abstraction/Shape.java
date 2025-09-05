package com.example.oop.abstraction;

public abstract class Shape {
    // Abstract method - must be implemented
    public abstract double calculateArea();

    // Concrete method
    public String getShapeName() {
        return "I am a shape";
    }
}
