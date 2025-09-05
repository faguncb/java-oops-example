package com.example.oop.inheritance;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class InheritanceTest {
    @Test
    @DisplayName("Car should inherit from Vehicle")
    void testCarInheritance() {
        Car myCar = new Car("Toyota", 4);

        // Test inherited methods
        assertEquals("Toyota", myCar.getBrand());
        assertEquals("Tuut, tuut!", myCar.honk());

        // Test Car-specific method
        assertEquals(4, myCar.getNumberOfDoors());
    }
}
