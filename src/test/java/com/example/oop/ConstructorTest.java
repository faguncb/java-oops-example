package com.example.oop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConstructorTest {

    @Test
    void testDefaultConstructor() {
        Person p = new Person();
        assertEquals("Unknown", p.getName());
        assertEquals(0, p.getAge());
    }

    @Test
    void testParameterizedConstructors() {
        Person p1 = new Person("Alice", 25);
        assertEquals("Alice", p1.getName());
        assertEquals(25, p1.getAge());

        Person p2 = new Person("Bob", 30, "bob@example.com");
        assertEquals("Bob", p2.getName());
        assertEquals("bob@example.com", p2.getEmail());

        Person p3 = new Person("Charlie", 35, "charlie@example.com", "USA");
        assertEquals("USA", p3.getCountry());
    }

    @Test
    void testConstructorChaining() {
        // All these constructors eventually call the master constructor
        Employee e1 = new Employee("John", "E001");
        assertEquals("General", e1.getDepartment());
        assertEquals(0.0, e1.getSalary());

        Employee e2 = new Employee("Jane", "E002", "IT");
        assertEquals("IT", e2.getDepartment());

        Employee e3 = new Employee("Jim", "E003", "HR", 50000.0);
        assertEquals(50000.0, e3.getSalary());
    }

    @Test
    void testCopyConstructor() {
        Book original = new Book("1984", "George Orwell", 328);
        Book copy = new Book(original);

        // Copy has same values
        assertEquals(original.getTitle(), copy.getTitle());
        assertEquals(original.getAuthor(), copy.getAuthor());
        assertEquals(original.getPages(), copy.getPages());

        // But they are different objects!
        assertNotSame(original, copy);

        // Changing copy doesn't affect original
        copy.setTitle("Animal Farm");
        assertEquals("1984", original.getTitle());
        assertEquals("Animal Farm", copy.getTitle());
    }

    @Test
    void testConstructorInInheritance() {
        // Parent constructor is called first, then child constructor
        Motorcycle bike = new Motorcycle("Harley-Davidson", 2023, false);

        assertEquals("Harley-Davidson", bike.getBrand());  // From parent
        assertEquals(2023, bike.getYear());                // From parent
        assertFalse(bike.hasSidecar());                    // From child
    }

    @Test
    void testConstructorOverloading() {
        // Constructors can be overloaded just like methods!
        Person p1 = new Person();
        Person p2 = new Person("Alice", 25);
        Person p3 = new Person("Bob", 30, "bob@example.com");
        Person p4 = new Person("Charlie", 35, "charlie@example.com", "USA");

        // All are valid Person objects, created differently
        assertNotNull(p1);
        assertNotNull(p2);
        assertNotNull(p3);
        assertNotNull(p4);
    }
}