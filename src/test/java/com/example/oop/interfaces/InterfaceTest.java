package com.oops.concepts.interfaces;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class InterfaceTest {
    @Test
    @DisplayName("Square should implement draw")
    void testSquareImplementation() {
        Drawable mySquare = new Square();
        assertEquals("Drawing a Square", mySquare.draw());
    }
}
