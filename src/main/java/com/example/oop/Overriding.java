package com.example.oop.overriding;

/**
 * Demonstrates Method Overriding - Child class provides specific implementation
 * of a method that's already defined in the parent class
 */
class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    // Method to be overridden
    public String makeSound() {
        return "Some generic animal sound";
    }

    // Method to demonstrate inheritance (not overridden)
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

    @Override  // This annotation helps catch errors at compile time
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

/**
 * Real-world example: Payment methods
 */
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