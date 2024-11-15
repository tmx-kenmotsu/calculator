package examples.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcTest {

    @Test
    void testAdd() {
        Calc calc = new Calc();
        int expected = 2;
        int actual = calc.add(1, 1);
        assertEquals(expected, actual);
    }
}
