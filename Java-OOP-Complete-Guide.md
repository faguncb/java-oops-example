# Java Object-Oriented Programming - Complete Beginner's Guide

**A comprehensive guide to understanding OOP concepts in Java**

---

## Table of Contents

1. [Project Overview](#project-overview)
2. [The Four Pillars of OOP](#the-four-pillars-of-oop)
   - [Classes and Objects](#1-classes-and-objects)
   - [Encapsulation](#2-encapsulation)
   - [Inheritance](#3-inheritance)
   - [Polymorphism](#4-polymorphism)
3. [Abstraction](#abstraction)
4. [Additional Concepts](#additional-concepts)
5. [Detailed Examples](#detailed-examples)
   - [Method Overloading](#method-overloading)
   - [Method Overriding](#method-overriding)
   - [Constructors](#constructors)
   - [Abstraction in Detail](#abstraction-in-detail)
   - [Java Collections](#java-collections)
6. [Summary and Comparisons](#summary-and-comparisons)

---

## Project Overview

This guide explains the **four main pillars of Object-Oriented Programming (OOP)** in Java through practical, easy-to-understand examples. Think of OOP as a way to organize code that mirrors how we think about the real world - with objects that have properties and can do things.

### What is Object-Oriented Programming?

OOP is a programming paradigm that organizes software design around data (objects) rather than functions and logic. It helps create:
- **Reusable code** (don't repeat yourself)
- **Organized structure** (easier to maintain)
- **Real-world modeling** (objects represent real things)
- **Secure programs** (data hiding and protection)

---

## The Four Pillars of OOP

### 1. Classes and Objects

**What it is:** A class is like a blueprint (think: a blueprint for a house), and an object is the actual thing you build from that blueprint (the actual house).

#### Example from the Project:

```java
package com.example.oop;

public class BasicClass {
    // Field (attribute)
    private String name;

    // Constructor to initialize the object
    public BasicClass(String name) {
        this.name = name;
    }

    // Method (behavior)
    public void displayName() {
        System.out.println("Object name: " + name);
    }
}
```

#### Usage:

```java
BasicClass obj = new BasicClass("Example Object");
obj.displayName();
```

- `BasicClass` is the blueprint
- `obj` is the actual object created from that blueprint
- The object has a `name` field and can `displayName()`

**Real-world analogy:** If "Car" is a class, then your specific Honda Civic is an object.

---

### 2. Encapsulation

**What it is:** Keeping data private and only allowing controlled access through special methods (getters and setters). It's like having a safe - you don't give direct access to what's inside, but provide a controlled way to get or put things in.

#### Example from the Project:

```java
package com.example.oop;

public class EncapsulationExample {
    // Private field: Cannot be accessed directly from outside
    private String secret;

    // Public getter method: Allows read access
    public String getSecret() {
        return secret;
    }

    // Public setter method: Allows controlled write access
    public void setSecret(String secret) {
        if (secret != null && !secret.isEmpty()) {
            this.secret = secret;
        } else {
            System.out.println("Invalid secret value");
        }
    }
}
```

#### Student Class Example:

```java
package com.example.oop.encapsulation;

public class Student {
    private final int studentId;
    private final String firstName;
    private char grade;

    public Student(int studentId, String firstName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.grade = 'N';
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char newGrade) {
        if (newGrade == 'A' || newGrade == 'B' ||
                newGrade == 'C' || newGrade == 'D' ||
                newGrade == 'F') {
            this.grade = newGrade;
        } else {
            System.out.println("Invalid grade.");
        }
    }
}
```

**Why it matters:** It prevents bugs. For example, the `Student` class only accepts valid grades (A, B, C, D, F) - it rejects invalid input automatically.

---

### 3. Inheritance

**What it is:** Creating new classes based on existing ones. The child class gets all the features of the parent class and can add its own.

#### Simple Inheritance:

```java
// Parent Class
package com.example.oop;

public class ParentClass {
    public void parentMethod() {
        System.out.println("Method from ParentClass");
    }
}

// Child Class
public class ChildClass extends ParentClass {
    public void childMethod() {
        System.out.println("Method from ChildClass");
    }
}
```

#### Multilevel Inheritance:

```java
public class GrandChildClass extends ChildClass {
    public void grandChildMethod() {
        System.out.println("Method from GrandChildClass");
    }
}
```

**Hierarchy:** `ParentClass → ChildClass → GrandChildClass`

`GrandChildClass` gets features from both `ParentClass` and `ChildClass`!

#### Real-world Vehicle Example:

```java
package com.example.oop.inheritance;

public class Vehicle {
    private final String brand;
    
    public Vehicle(String brand) { 
        this.brand = brand; 
    }
    
    public String getBrand() { 
        return brand; 
    }
    
    public String honk() { 
        return "Tuut, tuut!"; 
    }
}

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
```

- `Vehicle` has a `brand` and can `honk()`
- `Car` extends `Vehicle`, so it inherits those features AND adds `numberOfDoors`

**Real-world analogy:** You inherit traits from your parents, but you also have your own unique traits.

---

### 4. Polymorphism

**What it is:** The ability to use the same method name in different ways. It comes in two flavors:

#### a) Method Overriding - Same name, different behavior in child class

```java
// Parent Class
package com.example.oop;

public class PolymorphismParent {
    public void display() {
        System.out.println("Display from PolymorphismParent");
    }
}

// Child Class
public class PolymorphismChild extends PolymorphismParent {
    @Override
    public void display() {
        System.out.println("Overridden display from PolymorphismChild");
    }
}
```

The child class replaces the parent's method with its own version.

#### b) Method Overloading - Same name, different parameters

```java
package com.example.oop;

public class OverloadExample {
    // Overloaded method with 2 params
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with 3 params
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

**Usage:**
```java
OverloadExample overload = new OverloadExample();
System.out.println(overload.add(5, 10));       // Returns 15
System.out.println(overload.add(5, 10, 15));   // Returns 30
```

**Real-world analogy:** A "cook" button on a microwave behaves differently based on what you put in (popcorn vs. pizza) - same button, different behavior!

---

## Abstraction

**What it is:** Showing only essential features and hiding the implementation details. Like driving a car - you use the steering wheel and pedals without knowing how the engine works internally.

### Two Ways to Achieve Abstraction:

#### a) Abstract Classes

```java
package com.example.oop;

public abstract class AbstractClass {
    // Abstract method: Must be implemented by subclasses
    public abstract void abstractMethod();

    // Normal method: Can be inherited as-is
    public void normalMethod() {
        System.out.println("Normal method in AbstractClass");
    }
}

// Concrete class implementing the abstract class
public class ConcreteClass extends AbstractClass {
    @Override
    public void abstractMethod() {
        System.out.println("Implemented abstractMethod in ConcreteClass");
    }
}
```

- You **cannot** create objects from an abstract class directly
- Child classes **must** implement the abstract methods

#### Shape Example:

```java
package com.example.oop.abstraction;

public abstract class Shape {
    // Abstract method - must be implemented
    public abstract double calculateArea();

    // Concrete method
    public String getShapeName() {
        return "I am a shape";
    }
}

public class Circle extends Shape {
    private final double radius;
    
    public Circle(double radius) { 
        this.radius = radius; 
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
```

#### b) Interfaces

```java
package com.example.oop;

public interface MyInterface {
    // Abstract method
    void interfaceMethod();

    // Default method (Java 8+): Provides default implementation
    default void defaultMethod() {
        System.out.println("Default method in interface");
    }

    // Static method (Java 8+): Can be called without instance
    static String staticMethod() {
        return "Static method in interface";
    }
}

// Class implementing the interface
public class InterfaceImplementer implements MyInterface {
    @Override
    public void interfaceMethod() {
        System.out.println("Implemented interfaceMethod");
    }
}
```

- An interface is like a contract - it says "any class implementing me MUST provide these methods"

#### Drawable Interface Example:

```java
package com.example.oop.interfaces;

public interface Drawable {
    String draw(); // implicitly public and abstract
}

public class Circle implements Drawable {
    @Override
    public String draw() {
        return "Drawing a Circle";
    }
}

public class Square implements Drawable {
    @Override
    public String draw() {
        return "Drawing a Square";
    }
}
```

**Difference:** Abstract classes can have both complete methods and incomplete methods; interfaces traditionally only had method signatures (though modern Java allows default and static methods).

---

## Additional Concepts

### Constructors

Special methods called when creating an object, used to initialize values:

```java
public class BasicClass {
    private String name;
    
    // Constructor
    public BasicClass(String name) {
        this.name = name;  // Initialize the name field
    }
}
```

### Static Variables

Variables that belong to the class itself, not to individual objects. All objects share the same value:

```java
public class AdditionalConcepts {
    // Static variable: Belongs to class, not instance
    public static String staticVar = "Shared across instances";
}
```

### Final Variables

Variables that cannot be changed after being set (constants):

```java
public class AdditionalConcepts {
    // Final variable: Cannot be changed after initialization
    public final String finalVar;

    public AdditionalConcepts(String finalValue) {
        this.finalVar = finalValue; // Set final here
    }
}
```

---

## Detailed Examples

### Method Overloading

**Definition:** Same method name, different parameters. The compiler decides which method to call based on the arguments you pass.

#### Calculator Example:

```java
package com.example.oop.overloading;

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
```

#### PrintShop Example:

```java
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
```

#### Test Example:

```java
@Test
void testCalculatorOverloading() {
    Calculator calc = new Calculator();
    
    assertEquals(15, calc.add(5, 10));           // Calls add(int, int)
    assertEquals(30, calc.add(5, 10, 15));       // Calls add(int, int, int)
    assertEquals(15.5, calc.add(5.5, 10.0));     // Calls add(double, double)
    assertEquals("Hello World", calc.add("Hello ", "World")); // Calls add(String, String)
    
    // Test parameter order matters
    assertEquals("Score: 100", calc.format("Score", 100));
    assertEquals("100 - Score", calc.format(100, "Score"));
}
```

---

### Method Overriding

**Definition:** Child class provides specific implementation of a method that's already defined in the parent class.

#### Animal Example:

```java
package com.example.oop.overriding;

class Animal {
    private String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    // Method to be overridden
    public String makeSound() {
        return "Some generic animal sound";
    }
    
    public String getName() {
        return name;
    }
    
    // Method that uses overridden method (demonstrates polymorphism)
    public void introduce() {
        System.out.println("I am " + name + " and I say: " + makeSound());
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    
    @Override
    public String makeSound() {
        return "Woof! Woof!";
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    
    @Override
    public String makeSound() {
        return "Meow!";
    }
}

class Cow extends Animal {
    public Cow(String name) {
        super(name);
    }
    
    @Override
    public String makeSound() {
        return "Moo!";
    }
}
```

#### Payment Methods Example:

```java
class PaymentMethod {
    protected double amount;
    
    public void processPayment(double amount) {
        this.amount = amount;
        System.out.println("Processing payment of $" + amount);
    }
    
    public String getTransactionDetails() {
        return "Payment of $" + amount;
    }
}

class CreditCardPayment extends PaymentMethod {
    private String cardNumber;
    
    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    
    @Override
    public void processPayment(double amount) {
        this.amount = amount;
        System.out.println("Processing credit card payment of $" + amount);
        System.out.println("Card ending in: " + cardNumber.substring(cardNumber.length() - 4));
    }
    
    @Override
    public String getTransactionDetails() {
        return "Credit Card Payment: $" + amount + " (Card: ****" + 
               cardNumber.substring(cardNumber.length() - 4) + ")";
    }
}

class PayPalPayment extends PaymentMethod {
    private String email;
    
    public PayPalPayment(String email) {
        this.email = email;
    }
    
    @Override
    public void processPayment(double amount) {
        this.amount = amount;
        System.out.println("Processing PayPal payment of $" + amount);
        System.out.println("PayPal account: " + email);
    }
    
    @Override
    public String getTransactionDetails() {
        return "PayPal Payment: $" + amount + " (Account: " + email + ")";
    }
}
```

#### Test Example - Polymorphism:

```java
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
```

---

### Constructors

**Definition:** Special methods called when creating an object, used to initialize values.

#### Person Class - Different Constructor Types:

```java
package com.example.oop.constructors;

class Person {
    private String name;
    private int age;
    private String email;
    private String country;
    
    // 1. Default Constructor (no parameters)
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.email = "no-email@example.com";
        this.country = "Unknown";
        System.out.println("Default constructor called");
    }
    
    // 2. Parameterized Constructor (with parameters)
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.email = "no-email@example.com";
        this.country = "Unknown";
        System.out.println("Constructor with 2 parameters called");
    }
    
    // 3. Constructor with more parameters
    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.country = "Unknown";
        System.out.println("Constructor with 3 parameters called");
    }
    
    // 4. Constructor with all parameters
    public Person(String name, int age, String email, String country) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.country = country;
        System.out.println("Constructor with all parameters called");
    }
}
```

#### Constructor Chaining:

```java
class Employee {
    private String name;
    private String id;
    private String department;
    private double salary;
    
    // Constructor 1: Minimal info
    public Employee(String name, String id) {
        this(name, id, "General", 0.0);  // Calls Constructor 4
        System.out.println("2-parameter constructor");
    }
    
    // Constructor 2: With department
    public Employee(String name, String id, String department) {
        this(name, id, department, 0.0);  // Calls Constructor 4
        System.out.println("3-parameter constructor");
    }
    
    // Constructor 3: Master constructor (all parameters)
    public Employee(String name, String id, String department, double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
        System.out.println("Master constructor called");
    }
}
```

#### Copy Constructor:

```java
class Book {
    private String title;
    private String author;
    private int pages;
    
    // Regular constructor
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    
    // Copy constructor - creates a new Book with same values
    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.pages = other.pages;
        System.out.println("Copy constructor called");
    }
}
```

#### Constructor in Inheritance:

```java
class Vehicle {
    protected String brand;
    protected int year;
    
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
        System.out.println("Vehicle constructor called");
    }
}

class Motorcycle extends Vehicle {
    private boolean hasSidecar;
    
    public Motorcycle(String brand, int year, boolean hasSidecar) {
        super(brand, year);  // MUST call parent constructor first!
        this.hasSidecar = hasSidecar;
        System.out.println("Motorcycle constructor called");
    }
}
```

---

### Abstraction in Detail

#### Bank Account System:

```java
package com.example.oop.abstraction;

abstract class BankAccount {
    protected String accountNumber;
    protected String accountHolder;
    protected double balance;
    
    public BankAccount(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }
    
    // Abstract methods - MUST be implemented by subclasses
    public abstract void calculateInterest();
    public abstract double getMinimumBalance();
    
    // Concrete methods - can be used as-is by subclasses
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }
    
    public boolean withdraw(double amount) {
        if (amount > 0 && balance - amount >= getMinimumBalance()) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            return true;
        }
        System.out.println("Insufficient funds");
        return false;
    }
    
    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.04;  // 4% per year
    private static final double MIN_BALANCE = 100.0;
    
    public SavingsAccount(String accountNumber, String accountHolder) {
        super(accountNumber, accountHolder);
    }
    
    @Override
    public void calculateInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
        System.out.println("Interest added: $" + interest);
    }
    
    @Override
    public double getMinimumBalance() {
        return MIN_BALANCE;
    }
}

class CheckingAccount extends BankAccount {
    private static final double MIN_BALANCE = 0.0;
    private int freeTransactions;
    
    public CheckingAccount(String accountNumber, String accountHolder) {
        super(accountNumber, accountHolder);
        this.freeTransactions = 10;
    }
    
    @Override
    public void calculateInterest() {
        System.out.println("Checking accounts don't earn interest");
    }
    
    @Override
    public double getMinimumBalance() {
        return MIN_BALANCE;
    }
}
```

#### Interface - Media Player:

```java
interface Playable {
    void play();
    void pause();
    void stop();
}

interface Recordable {
    void startRecording();
    void stopRecording();
    boolean isRecording();
}

// A class can implement multiple interfaces!
class MediaPlayer implements Playable, Recordable {
    private boolean playing;
    private boolean recording;
    private String currentFile;
    
    @Override
    public void play() {
        playing = true;
        System.out.println("Playing: " + currentFile);
    }
    
    @Override
    public void pause() {
        playing = false;
        System.out.println("Paused");
    }
    
    @Override
    public void stop() {
        playing = false;
        currentFile = null;
        System.out.println("Stopped");
    }
    
    @Override
    public void startRecording() {
        recording = true;
        System.out.println("Recording started");
    }
    
    @Override
    public void stopRecording() {
        recording = false;
        System.out.println("Recording stopped");
    }
    
    @Override
    public boolean isRecording() {
        return recording;
    }
    
    public void loadFile(String filename) {
        this.currentFile = filename;
    }
}
```

#### Interface with Default and Static Methods:

```java
interface Notification {
    // Abstract method
    void send(String message);
    
    // Default method - provides default implementation
    default void sendWithTimestamp(String message) {
        String timestamp = java.time.LocalDateTime.now().toString();
        send("[" + timestamp + "] " + message);
    }
    
    // Static method - belongs to interface itself
    static String formatMessage(String message) {
        return "*** " + message + " ***";
    }
}

class EmailNotification implements Notification {
    private String email;
    
    public EmailNotification(String email) {
        this.email = email;
    }
    
    @Override
    public void send(String message) {
        System.out.println("Sending email to " + email + ": " + message);
    }
}

class SMSNotification implements Notification {
    private String phoneNumber;
    
    public SMSNotification(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public void send(String message) {
        System.out.println("Sending SMS to " + phoneNumber + ": " + message);
    }
    
    // Can override default method if needed
    @Override
    public void sendWithTimestamp(String message) {
        System.out.println("SMS doesn't support timestamps, sending plain message");
        send(message);
    }
}
```

---

### Java Collections

**Definition:** Collections are data structures to store and manipulate groups of objects.

#### List - Ordered Collection (Allows Duplicates)

```java
import java.util.*;

// ArrayList - fast for accessing elements by index
List<String> fruits = new ArrayList<>();
fruits.add("Apple");
fruits.add("Banana");
fruits.add("Orange");
fruits.add("Apple");  // Duplicates allowed!

// LinkedList - fast for adding/removing elements
List<String> tasks = new LinkedList<>();
tasks.add("Task 1");
tasks.add("Task 2");
tasks.add("Task 3");
```

**List Operations:**

```java
List<Integer> numbers = new ArrayList<>();

// Adding elements
numbers.add(10);
numbers.add(20);
numbers.add(30);
numbers.add(1, 15);  // Add at specific index

// Accessing elements
int first = numbers.get(0);
int size = numbers.size();

// Modifying elements
numbers.set(0, 5);  // Replace element at index 0

// Removing elements
numbers.remove(0);           // Remove by index
numbers.remove(Integer.valueOf(20));  // Remove by value

// Checking existence
boolean contains15 = numbers.contains(15);

// Iterating
for (Integer num : numbers) {
    System.out.println(num);
}
```

#### Set - Unordered Collection (NO Duplicates)

```java
// HashSet - fast, no order guaranteed
Set<String> uniqueNames = new HashSet<>();
uniqueNames.add("Alice");
uniqueNames.add("Bob");
uniqueNames.add("Alice");  // Won't be added again!
// Size will be 2, not 3

// TreeSet - keeps elements sorted
Set<Integer> sortedNumbers = new TreeSet<>();
sortedNumbers.add(5);
sortedNumbers.add(1);
sortedNumbers.add(3);
// Will be stored as: 1, 3, 5 (sorted)

// LinkedHashSet - maintains insertion order
Set<String> orderedSet = new LinkedHashSet<>();
orderedSet.add("First");
orderedSet.add("Second");
orderedSet.add("Third");
// Maintains order: First, Second, Third
```

**Set Operations:**

```java
Set<String> set1 = new HashSet<>(Arrays.asList("A", "B", "C"));
Set<String> set2 = new HashSet<>(Arrays.asList("B", "C", "D"));

// Union (all elements from both sets)
Set<String> union = new HashSet<>(set1);
union.addAll(set2);  // {A, B, C, D}

// Intersection (common elements)
Set<String> intersection = new HashSet<>(set1);
intersection.retainAll(set2);  // {B, C}

// Difference (elements in set1 but not in set2)
Set<String> difference = new HashSet<>(set1);
difference.removeAll(set2);  // {A}
```

#### Map - Key-Value Pairs

```java
// HashMap - fast, no order guaranteed
Map<String, Integer> ages = new HashMap<>();
ages.put("Alice", 25);
ages.put("Bob", 30);
ages.put("Charlie", 35);
ages.put("Alice", 26);  // Updates Alice's age to 26

// TreeMap - keeps keys sorted
Map<String, String> countries = new TreeMap<>();
countries.put("USA", "Washington DC");
countries.put("UK", "London");
countries.put("France", "Paris");
// Keys will be sorted: France, UK, USA

// LinkedHashMap - maintains insertion order
Map<String, Double> prices = new LinkedHashMap<>();
prices.put("Apple", 1.50);
prices.put("Banana", 0.75);
prices.put("Orange", 1.25);
// Maintains order: Apple, Banana, Orange
```

**Map Operations:**

```java
Map<String, Integer> scores = new HashMap<>();

// Adding key-value pairs
scores.put("Alice", 95);
scores.put("Bob", 87);
scores.put("Charlie", 92);

// Getting values
int aliceScore = scores.get("Alice");
int defaultScore = scores.getOrDefault("David", 0);

// Checking existence
boolean hasAlice = scores.containsKey("Alice");
boolean hasScore95 = scores.containsValue(95);

// Removing entries
scores.remove("Bob");

// Iterating over keys
for (String name : scores.keySet()) {
    System.out.println(name);
}

// Iterating over values
for (Integer score : scores.values()) {
    System.out.println(score);
}

// Iterating over entries
for (Map.Entry<String, Integer> entry : scores.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}
```

#### Queue - FIFO (First In, First Out)

```java
Queue<String> queue = new LinkedList<>();
queue.offer("First");
queue.offer("Second");
queue.offer("Third");

// peek() - look at first without removing
String first = queue.peek();

// poll() - remove and return first
String served = queue.poll();
```

**PriorityQueue:**

```java
// Elements come out in priority order (smallest first by default)
PriorityQueue<Integer> pq = new PriorityQueue<>();
pq.offer(5);
pq.offer(1);
pq.offer(3);

// Will come out as: 1, 3, 5 (sorted order)
```

#### Real-World Example: Student Grade System

```java
public class StudentGradeSystem {
    private Map<String, List<Integer>> studentGrades;
    private Set<String> enrolledStudents;
    
    public StudentGradeSystem() {
        this.studentGrades = new HashMap<>();
        this.enrolledStudents = new HashSet<>();
    }
    
    public void enrollStudent(String studentName) {
        if (enrolledStudents.add(studentName)) {
            studentGrades.put(studentName, new ArrayList<>());
            System.out.println(studentName + " enrolled successfully");
        } else {
            System.out.println(studentName + " is already enrolled");
        }
    }
    
    public void addGrade(String studentName, int grade) {
        if (enrolledStudents.contains(studentName)) {
            studentGrades.get(studentName).add(grade);
            System.out.println("Grade " + grade + " added for " + studentName);
        } else {
            System.out.println("Student not found");
        }
    }
    
    public double getAverageGrade(String studentName) {
        if (!enrolledStudents.contains(studentName)) {
            return 0.0;
        }
        
        List<Integer> grades = studentGrades.get(studentName);
        if (grades.isEmpty()) {
            return 0.0;
        }
        
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }
    
    public Map<String, Double> getAllAverages() {
        Map<String, Double> averages = new TreeMap<>();
        for (String student : enrolledStudents) {
            averages.put(student, getAverageGrade(student));
        }
        return averages;
    }
}
```

---

## Summary and Comparisons

### Overloading vs Overriding

| Feature | Overloading | Overriding |
|---------|-------------|------------|
| **Definition** | Same method name, different parameters | Same method signature in parent and child |
| **When** | Compile-time (Static Polymorphism) | Runtime (Dynamic Polymorphism) |
| **Where** | Same class or inherited class | Parent and child class |
| **Example** | `add(int, int)` and `add(double, double)` | Parent's `makeSound()` vs Child's `makeSound()` |
| **Return Type** | Can be different | Must be same or covariant |
| **@Override** | Not used | Should be used |

### Collections Quick Reference

| Collection Type | Ordered? | Duplicates? | Implementation | Use When |
|----------------|----------|-------------|----------------|----------|
| **ArrayList** | Yes | Yes | Dynamic array | Need fast access by index |
| **LinkedList** | Yes | Yes | Doubly-linked list | Need fast insertion/deletion |
| **HashSet** | No | No | Hash table | Need unique elements, no order |
| **TreeSet** | Sorted | No | Red-black tree | Need sorted unique elements |
| **LinkedHashSet** | Insertion order | No | Hash table + Linked list | Need unique elements with order |
| **HashMap** | No | No (keys) | Hash table | Need fast key-value lookup |
| **TreeMap** | Sorted by key | No (keys) | Red-black tree | Need sorted key-value pairs |
| **LinkedHashMap** | Insertion order | No (keys) | Hash table + Linked list | Need ordered key-value pairs |
| **Queue** | FIFO | Yes | Various | Need FIFO processing |
| **PriorityQueue** | Priority order | Yes | Heap | Need priority-based processing |

### Abstract Class vs Interface

| Feature | Abstract Class | Interface |
|---------|---------------|-----------|
| **Methods** | Can have both abstract and concrete methods | Only abstract (but can have default/static in Java 8+) |
| **Variables** | Can have any type of variables | Only public static final (constants) |
| **Inheritance** | A class can extend only one abstract class | A class can implement multiple interfaces |
| **Constructor** | Can have constructors | Cannot have constructors |
| **Access Modifiers** | Can use any access modifier | Methods are public by default |
| **Use When** | Classes share common behavior | Define a contract for unrelated classes |

### The Four Pillars Summary

1. **Encapsulation**: Hide data using private fields, provide controlled access through public methods
   - **Benefits**: Data security, validation, flexibility to change implementation

2. **Inheritance**: Create new classes based on existing classes using `extends`
   - **Benefits**: Code reuse, hierarchical relationships, easier maintenance

3. **Polymorphism**: Same method name, different behaviors (overloading & overriding)
   - **Benefits**: Flexibility, extensibility, cleaner code

4. **Abstraction**: Hide implementation details, show only essential features
   - **Benefits**: Reduced complexity, separation of concerns, easier to maintain

---

## How Everything Connects - The Main Class

```java
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

        // 6. Additional Concepts
        System.out.println("\n--- Additional Concepts ---");
        AdditionalConcepts additional = new AdditionalConcepts("Initialized via constructor");
        additional.display();
        System.out.println("Static variable: " + AdditionalConcepts.staticVar);
    }
}
```

---

## Key Takeaways

### Remember These Core Concepts:

1. **Classes & Objects**: Blueprint and instances
2. **Encapsulation**: Keep data private, access through methods (getters/setters)
3. **Inheritance**: Reuse code by extending classes (parent → child)
4. **Polymorphism**: Same method name, different behaviors (overloading & overriding)
5. **Abstraction**: Hide complexity, show only what's necessary (abstract classes & interfaces)

### Best Practices:

- Use **encapsulation** to protect your data
- Use **inheritance** to avoid code duplication
- Use **polymorphism** to write flexible, extensible code
- Use **abstraction** to manage complexity
- Choose the right **collection** for your needs
- Always use `@Override` annotation when overriding methods
- Prefer composition over inheritance when appropriate
- Program to an interface, not an implementation

### When to Use What:

- **ArrayList**: When you need fast random access
- **LinkedList**: When you need fast insertion/deletion
- **HashSet**: When you need unique elements without order
- **TreeSet**: When you need unique sorted elements
- **HashMap**: When you need fast key-value lookups
- **Abstract Class**: When classes share common behavior
- **Interface**: When you need to define a contract

---

## Additional Resources

### Running the Project:

```bash
# Build the project
./gradlew build

# Run the application
./gradlew run

# Run tests
./gradlew test
```

### Project Structure:

```
src/main/java/com/example/oop/
├── Main.java
├── BasicClass.java
├── EncapsulationExample.java
├── ParentClass.java
├── ChildClass.java
├── GrandChildClass.java
├── PolymorphismParent.java
├── PolymorphismChild.java
├── OverloadExample.java
├── AbstractClass.java
├── ConcreteClass.java
├── MyInterface.java
├── InterfaceImplementer.java
├── AdditionalConcepts.java
├── encapsulation/
│   └── Student.java
├── inheritance/
│   ├── Vehicle.java
│   └── Car.java
├── abstraction/
│   ├── Shape.java
│   └── Circle.java
└── interfaces/
    ├── Drawable.java
    ├── Circle.java
    └── Square.java
```

---

## Conclusion

This comprehensive guide covers all the essential Object-Oriented Programming concepts in Java. The project provides working examples for each concept, making it easy to understand and apply OOP principles in real-world scenarios.

Remember: **Practice is key!** Try modifying the examples, create your own classes, and experiment with different OOP concepts to solidify your understanding.

Happy Coding! 🚀

---

*Document created: October 8, 2025*
*Java Version: OpenJDK 24.0.1*
*Build Tool: Gradle 8.x*

