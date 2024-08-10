package pl.coderslab.tydzień2.z2parametryzowanieTestówEnum;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @ParameterizedTest
    @EnumSource(Numbers.class)
    void greatNumber(Numbers numbers) {
        assertEquals(Calculator.greatNumber(numbers.number), numbers.isGreatNumber);
    }
}