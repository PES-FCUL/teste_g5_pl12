package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Calc358Test {

    @Test
    void isAboveZeroWorks() {
        assertTrue(Calc358.isAboveZero(3));
        assertFalse(Calc358.isAboveZero(-3));
        assertFalse(Calc358.isAboveZero(0));
    }

    @Test
    void absoluteWorks() {
        assertEquals(5, Calc358.absolute(5));
        assertEquals(5, Calc358.absolute(-5));
    }

    @Test
    void evenWorks() {
        assertTrue(Calc358.even(4));
        assertFalse(Calc358.even(7));
    }

    @Test
    void multiply2and5() {
        assertTrue(Calc358.scale(2) == 10);
        assertFalse(Calc358.scale(2) != 10);
    }

    @Test
    void multiply3and5() {
        assertTrue(Calc358.scale(3) == 15);
        assertFalse(Calc358.scale(3) != 15);
    }

    @Test
    void multiply24and5() {
        assertTrue(Calc358.scale(4) == 20);
        assertFalse(Calc358.scale(4) != 20);
    }

    @Test
    void sum1and2() {
        assertTrue(Calc358.sum(1,2) == 3);
        assertFalse(Calc358.sum(1,2) != 3);
    }

    @Test
    void sum1and3() {
        assertTrue(Calc358.sum(1,3) == 4);
        assertFalse(Calc358.sum(1,3) != 4);
    }
}
