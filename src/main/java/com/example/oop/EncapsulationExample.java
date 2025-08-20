package com.example.oop;

// Demonstrates Encapsulation: Bundling data and methods, restricting access to data (data hiding).
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
