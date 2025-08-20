package com.example.oop;

// Demonstrates Polymorphism via Method Overriding: Same method name/signature as parent, but different implementation.
public class PolymorphismChild extends PolymorphismParent {
    @Override
    public void display() {
        System.out.println("Overridden display from PolymorphismChild");
    }
}
