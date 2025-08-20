package com.example.oop;

// Demonstrates Abstraction: Abstract class cannot be instantiated, provides a template.
// Use 'abstract' keyword for class and methods without implementation.
public abstract class AbstractClass {
    // Abstract method: Must be implemented by subclasses
    public abstract void abstractMethod();

    // Normal method: Can be inherited as-is
    public void normalMethod() {
        System.out.println("Normal method in AbstractClass");
    }
}
