package pl.coderslab.tydzień2.z3testowanieWyjątków;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class CalcTest {

    @Test
    void factorial() {
        assertThrows(IllegalArgumentException.class, () -> Calc.factorial(-1));
    }

    @Test
    void sqrt() {
        NegativeNumberException negativeNumberException = assertThrows(NegativeNumberException.class, () -> Calc.sqrt(-9));
        assumeTrue(System.getProperty("os.name").contains("Linux"));
        assertThrows(negativeNumberException.getClass(), () ->Calc.sqrt(-7));
        assertEquals("Negative is not allowed", negativeNumberException.getMessage());
    }
}