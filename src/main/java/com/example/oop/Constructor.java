package com.example.oop.constructor;

/**
 * Demonstrates different types of constructors
 */
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

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return email; }
    public String getCountry() { return country; }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age +
                ", email='" + email + "', country='" + country + "'}";
    }
}

/**
 * Constructor Chaining - calling one constructor from another
 */
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

    // Constructor 3: With salary
    public Employee(String name, String id, double salary) {
        this(name, id, "General", salary);  // Calls Constructor 4
        System.out.println("Constructor with salary");
    }

    // Constructor 4: Master constructor (all parameters)
    public Employee(String name, String id, String department, double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
        System.out.println("Master constructor called");
    }

    public String getName() { return name; }
    public String getId() { return id; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
}

/**
 * Copy Constructor - creates a copy of an object
 */
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

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getPages() { return pages; }

    public void setTitle(String title) { this.title = title; }
}

/**
 * Constructor in Inheritance
 */
class Vehicle {
    protected String brand;
    protected int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
        System.out.println("Vehicle constructor called");
    }

    public String getBrand() { return brand; }
    public int getYear() { return year; }
}

class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, int year, boolean hasSidecar) {
        super(brand, year);  // MUST call parent constructor first!
        this.hasSidecar = hasSidecar;
        System.out.println("Motorcycle constructor called");
    }

    public boolean hasSidecar() { return hasSidecar; }
}