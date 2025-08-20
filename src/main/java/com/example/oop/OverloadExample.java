package com.example.oop;

// Demonstrates Polymorphism via Method Overloading: Same method name, different parameters.
public class OverloadExample {
    // Overloaded method with 2 params
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with 3 params
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
