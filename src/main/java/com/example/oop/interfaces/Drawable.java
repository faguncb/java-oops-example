package com.example.oop.interfaces;

public interface Drawable {
    String draw(); // implicitly public and abstract
}

public class Square implements Drawable {
    @Override
    public String draw() {
        return "Drawing a Square";
    }
}

public class Circle implements Drawable {
    @Override
    public String draw() {
        return "Drawing a Circle";
    }
}
