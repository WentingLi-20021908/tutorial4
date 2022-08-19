package org.tutorial4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestCalc {
    @Test
    void testAddition() {
        Calc c = new Calc();
        assertEquals(6, c.add(2,4));
    }
    @Test
    void testSubtract() {
        Calc c = new Calc();
        assertEquals(-2, c.subtract(2,4));
    }
}
