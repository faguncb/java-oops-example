package com.example.oop;

public class Main {
    public static void main(String[] args) {
        System.out.println("Demonstrating OOP Concepts in Java");

        // 1. Classes and Objects
        System.out.println("\n--- Classes and Objects ---");
        BasicClass obj = new BasicClass("Example Object");
        obj.displayName();

        // 2. Encapsulation
        System.out.println("\n--- Encapsulation ---");
        EncapsulationExample encap = new EncapsulationExample();
        encap.setSecret("Hidden Value");
        System.out.println("Accessed via getter: " + encap.getSecret());

        // 3. Inheritance
        System.out.println("\n--- Inheritance ---");
        ChildClass child = new ChildClass();
        child.parentMethod(); // Inherited from ParentClass
        child.childMethod();

        // Multilevel Inheritance
        GrandChildClass grandChild = new GrandChildClass();
        grandChild.parentMethod(); // From ParentClass
        grandChild.childMethod(); // From ChildClass
        grandChild.grandChildMethod();

        // 4. Polymorphism
        System.out.println("\n--- Polymorphism (Overriding) ---");
        PolymorphismChild polyChild = new PolymorphismChild();
        polyChild.display(); // Overridden method

        // Method Overloading
        System.out.println("\n--- Polymorphism (Overloading) ---");
        OverloadExample overload = new OverloadExample();
        System.out.println("Sum of two ints: " + overload.add(5, 10));
        System.out.println("Sum of three ints: " + overload.add(5, 10, 15));

        // 5. Abstraction
        System.out.println("\n--- Abstraction (Abstract Class) ---");
        ConcreteClass concrete = new ConcreteClass();
        concrete.abstractMethod(); // Implemented
        concrete.normalMethod(); // Inherited

        // Abstraction with Interface
        System.out.println("\n--- Abstraction (Interface) ---");
        InterfaceImplementer impl = new InterfaceImplementer();
        impl.interfaceMethod();
        System.out.println("Static interface method: " + MyInterface.staticMethod());

        // 6. Additional Concepts (e.g., Constructors, Static, Final)
        System.out.println("\n--- Additional Concepts ---");
        AdditionalConcepts additional = new AdditionalConcepts("Initialized via constructor");
        additional.display();
        System.out.println("Static variable: " + AdditionalConcepts.staticVar);
        // additional.finalVar = "Change"; // Error: cannot change final
    }
}
