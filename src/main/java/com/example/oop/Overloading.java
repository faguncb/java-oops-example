package com.example.oop;

/**
 * Demonstrates Method Overloading - Same method name, different parameters
 * The compiler decides which method to call based on the arguments you pass
 */
public class Calculator {

    // Overload 1: Add two integers
    public int add(int a, int b) {
        System.out.println("Adding two integers");
        return a + b;
    }

    // Overload 2: Add three integers
    public int add(int a, int b, int c) {
        System.out.println("Adding three integers");
        return a + b + c;
    }

    // Overload 3: Add two doubles
    public double add(double a, double b) {
        System.out.println("Adding two doubles");
        return a + b;
    }

    // Overload 4: Add two strings (concatenation)
    public String add(String a, String b) {
        System.out.println("Concatenating two strings");
        return a + b;
    }

    // Overload 5: Different parameter order also counts!
    public String format(String text, int number) {
        return text + ": " + number;
    }

    public String format(int number, String text) {
        return number + " - " + text;
    }
}

/**
 * Real-world example: A Print Shop that can print different things
 */
class PrintShop {

    // Print a single document
    public void print(String document) {
        System.out.println("Printing document: " + document);
    }

    // Print multiple copies
    public void print(String document, int copies) {
        System.out.println("Printing " + copies + " copies of: " + document);
    }

    // Print with color option
    public void print(String document, int copies, boolean color) {
        String colorType = color ? "color" : "black & white";
        System.out.println("Printing " + copies + " " + colorType + " copies of: " + document);
    }

    // Print an array of documents
    public void print(String[] documents) {
        System.out.println("Batch printing " + documents.length + " documents");
        for (String doc : documents) {
            System.out.println("  - " + doc);
        }
    }
}