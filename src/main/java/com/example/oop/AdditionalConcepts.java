package com.example.oop;

// Demonstrates additional OOP concepts like constructors, static, final.
public class AdditionalConcepts {
    // Static variable: Belongs to class, not instance
    public static String staticVar = "Shared across instances";

    // Final variable: Cannot be changed after initialization
    public final String finalVar;

    // Constructor: Called when object is created
    public AdditionalConcepts(String finalValue) {
        this.finalVar = finalValue; // Set final here
    }

    public void display() {
        System.out.println("Final variable: " + finalVar);
    }
}
