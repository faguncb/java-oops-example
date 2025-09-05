package com.example.oop.polymorphism;

public class Animal {
    public String makeSound() {
        return "Generic animal sound";
    }
}

public class Dog extends Animal {
    @Override
    public String makeSound() {
        return "Woof woof!";
    }
}

public class Cat extends Animal {
    @Override
    public String makeSound() {
        return "Meow!";
    }
}
