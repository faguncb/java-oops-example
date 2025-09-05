package com.example.oop.inheritance;

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
