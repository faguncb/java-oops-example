package com.example.oop.inheritance;

// Superclass
public class Vehicle {
    private final String brand;
    public Vehicle(String brand) { this.brand = brand; }
    public String getBrand() { return brand; }
    public String honk() { return "Tuut, tuut!"; }
}

// Subclass
public class Car extends Vehicle {
    private final int numberOfDoors;
    public Car(String brand, int doors) {
        super(brand); // Call superclass constructor
        this.numberOfDoors = doors;
    }
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}
