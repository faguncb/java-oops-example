package com.example.oop;

// Demonstrates Classes and Objects: A class is a blueprint, an object is an instance of the class.
public class BasicClass {
    // Field (attribute)
    private String name;

    // Constructor to initialize the object
    public BasicClass(String name) {
        this.name = name;
    }

    // Method (behavior)
    public void displayName() {
        System.out.println("Object name: " + name);
    }
}
