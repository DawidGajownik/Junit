package pl.coderslab.tydzien2.z2parametryzowanieTestówEnum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.*;

class SquareCalculatorTest {

    @ParameterizedTest
    @EnumSource(SquareScenario.class)
    void square(SquareScenario squareScenario) {
        assertEquals(SquareCalculator.square(squareScenario.input), squareScenario.expectedOutput);
    }
}