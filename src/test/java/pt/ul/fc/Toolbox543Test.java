package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

import org.junit.jupiter.api.Test;

class Toolbox543Test {

    @Test
    void greaterThanZeroWorks() {
        assertTrue(Toolbox543.greaterThanZero(3));
        assertFalse(Toolbox543.greaterThanZero(-3));
        assertFalse(Toolbox543.greaterThanZero(0));
    }

    @Test
    void evenWorks() {
        assertTrue(Toolbox543.even(4));
        assertFalse(Toolbox543.even(7));
    }

    @Test
    void multiplyWorks() {
        assertEquals(5 * 7, Toolbox543.multiply(5));
        assertEquals(0, Toolbox543.multiply(0));
    }

    @Test
    void magnitudeWorks() {
        assertEquals(5, Toolbox543.magnitude(-5));
        assertEquals(3, Toolbox543.magnitude(3));
    }

    @Test
    void areaWorks() {
        assertEquals(5 * 3, Toolbox543.area(5, 3));
        assertEquals(4 * 7, Toolbox543.area(4, 7));
    }
}
