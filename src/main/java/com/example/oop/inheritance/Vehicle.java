package com.example.oop.inheritance;

public class Vehicle {
    private final String brand;
    public Vehicle(String brand) { this.brand = brand; }
    public String getBrand() { return brand; }
    public String honk() { return "Tuut, tuut!"; }
}
