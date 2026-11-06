package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class Utils992Test {

    @Test
    void largerWorks() {
        assertEquals(9, Utils992.larger(9, 2));
        assertEquals(9, Utils992.larger(2, 9));
    }

    @Test
    void magnitudeWorks() {
        assertEquals(5, Utils992.magnitude(5));
        assertEquals(5, Utils992.magnitude(-5));
    }

    @Test
    void positiveWorks() {
        assertTrue(Utils992.positive(3));
        assertFalse(Utils992.positive(-3));
        assertFalse(Utils992.positive(0));
    }

    @Test 
    void sumWorks() {
        assertEquals(2, Utils992.sum(1, 1) );
    }
    @Test 
    void multWorks() {
        assertEquals(5, Utils992.times(1));
    }
}
