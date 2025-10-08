package com.example.oop.overriding;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OverridingTest {

    @Test
    void testAnimalSounds() {
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");
        Cow cow = new Cow("Bessie");

        assertEquals("Woof! Woof!", dog.makeSound());
        assertEquals("Meow!", cat.makeSound());
        assertEquals("Moo!", cow.makeSound());
    }

    @Test
    void testPolymorphism() {
        // This is the power of overriding + polymorphism!
        // We can treat all animals the same way
        Animal[] animals = {
                new Dog("Rex"),
                new Cat("Fluffy"),
                new Cow("Daisy")
        };

        // Each animal makes its own sound despite being stored as Animal type
        assertEquals("Woof! Woof!", animals[0].makeSound());
        assertEquals("Meow!", animals[1].makeSound());
        assertEquals("Moo!", animals[2].makeSound());
    }

    @Test
    void testRuntimePolymorphism() {
        // Overriding is also called "Runtime Polymorphism"
        // The JVM decides which method to call at runtime

        Animal animal = new Dog("Buddy");  // Parent reference, child object
        assertEquals("Woof! Woof!", animal.makeSound());  // Calls Dog's version!

        animal = new Cat("Whiskers");  // Same reference, different object
        assertEquals("Meow!", animal.makeSound());  // Now calls Cat's version!
    }

    @Test
    void testPaymentMethods() {
        PaymentMethod payment1 = new CreditCardPayment("1234567890123456");
        PaymentMethod payment2 = new PayPalPayment("user@example.com");

        payment1.processPayment(100.00);
        payment2.processPayment(50.00);

        assertTrue(payment1.getTransactionDetails().contains("Credit Card"));
        assertTrue(payment2.getTransactionDetails().contains("PayPal"));
    }

    @Test
    void testMethodNotOverridden() {
        Dog dog = new Dog("Max");

        // getName() is inherited from Animal, not overridden
        assertEquals("Max", dog.getName());

        // makeSound() is overridden in Dog
        assertEquals("Woof! Woof!", dog.makeSound());
    }
}