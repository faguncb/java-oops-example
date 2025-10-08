package com.example.oop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OverloadingTest {

    @Test
    void testCalculatorOverloading() {
        Calculator calc = new Calculator();

        // Test different overloaded methods
        assertEquals(15, calc.add(5, 10));           // Calls add(int, int)
        assertEquals(30, calc.add(5, 10, 15));       // Calls add(int, int, int)
        assertEquals(15.5, calc.add(5.5, 10.0));     // Calls add(double, double)
        assertEquals("Hello World", calc.add("Hello ", "World")); // Calls add(String, String)

        // Test parameter order matters
        assertEquals("Score: 100", calc.format("Score", 100));
        assertEquals("100 - Score", calc.format(100, "Score"));
    }

    @Test
    void testPrintShopOverloading() {
        PrintShop shop = new PrintShop();

        // All these use the same method name but different parameters
        shop.print("Resume.pdf");
        shop.print("Resume.pdf", 3);
        shop.print("Resume.pdf", 3, true);
        shop.print(new String[]{"Doc1.pdf", "Doc2.pdf", "Doc3.pdf"});
    }

    @Test
    void testCompileTimePolymorphism() {
        // Overloading is also called "Compile-time Polymorphism"
        // The compiler decides which method to call at compile time
        Calculator calc = new Calculator();

        int result1 = calc.add(1, 2);        // Compiler knows to call add(int, int)
        double result2 = calc.add(1.5, 2.5); // Compiler knows to call add(double, double)

        assertEquals(3, result1);
        assertEquals(4.0, result2);
    }
}