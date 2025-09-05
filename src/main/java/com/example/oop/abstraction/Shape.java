package com.example.oop.abstraction;

public abstract class Shape {
    // Abstract method - must be implemented
    public abstract double calculateArea();

    // Concrete method
    public String getShapeName() {
        return "I am a shape";
    }
}

public class Circle extends Shape {
    private final double radius;
    public Circle(double radius) { this.radius = radius; }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
