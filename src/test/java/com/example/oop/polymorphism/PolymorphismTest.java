package com.example.oop.polymorphism;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class PolymorphismTest {
    @Test
    @DisplayName("Polymorphism via method overriding")
    void testPolymorphism() {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        assertEquals("Woof woof!", myDog.makeSound());
        assertEquals("Meow!", myCat.makeSound());
    }
}
