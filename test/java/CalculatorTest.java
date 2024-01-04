import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator c = new Calculator();
        int expected = 2;
        int actual = c.add(1,1);
        assertEquals(expected,actual);
    }
}