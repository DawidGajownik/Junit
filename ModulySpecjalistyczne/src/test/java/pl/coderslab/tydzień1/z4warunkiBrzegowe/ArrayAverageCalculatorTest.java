package pl.coderslab.tydzień1.z4warunkiBrzegowe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayAverageCalculatorTest {

    @Test
    void calculateAverage() {
        //given
        ArrayAverageCalculator arrayAverageCalculator = new ArrayAverageCalculator();

        //when
        var arg = new int[]{12, 32, 43};
        var result = arrayAverageCalculator.calculateAverage(arg);
        var expected = 29;

        //then
        assertEquals(expected, result);
    }
    @Test
    void calculateAverage2() {
        //given
        ArrayAverageCalculator arrayAverageCalculator = new ArrayAverageCalculator();

        //when
        var arg = new int[]{7, 13, 23, 18};
        var result = arrayAverageCalculator.calculateAverage(arg);
        var expected = 15.25;

        //then
        assertEquals(expected, result);
    }

    @Test
    void calculateAverage3() {
        //given
        ArrayAverageCalculator arrayAverageCalculator = new ArrayAverageCalculator();

        //when
        var arg = new int[]{};
        var result = arrayAverageCalculator.calculateAverage(arg);
        var expected = 0;

        //then
        assertEquals(expected, result);
    }
}