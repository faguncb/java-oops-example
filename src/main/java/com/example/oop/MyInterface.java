package com.example.oop;

// Demonstrates Abstraction via Interface: A contract with method signatures (no implementation until default/static).
// Classes 'implement' interfaces.
public interface MyInterface {
    // Abstract method
    void interfaceMethod();

    // Default method (Java 8+): Provides default implementation
    default void defaultMethod() {
        System.out.println("Default method in interface");
    }

    // Static method (Java 8+): Can be called without instance
    static String staticMethod() {
        return "Static method in interface";
    }
}
