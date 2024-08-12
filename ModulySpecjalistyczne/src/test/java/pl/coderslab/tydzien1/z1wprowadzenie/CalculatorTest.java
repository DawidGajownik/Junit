package pl.coderslab.tydzien1.z1wprowadzenie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        int test1 = Calculator.add(2,2);
        int test2 = Calculator.add(-3,2);
        int test3 = Calculator.add(3,-2);
        int test4 = Calculator.add(-3,-2);
        int test5 = Calculator.add(0,-1);
        assertEquals(4, test1);
        assertEquals(-1, test2);
        assertEquals(1, test3);
        assertEquals(-5, test4);
        assertEquals(-1, test5);
    }
    @Test
    void multiply() {
        int test1 = Calculator.multiply(4,3);
        int test2 = Calculator.multiply(-4,-4);
        int test3 = Calculator.multiply(2,0);
        assertEquals(12,test1);
        assertEquals(16,test2);
        assertEquals(0 ,test3);
    }
    @Test
    void subtract() {
        int test1 = Calculator.subtract(3,5);
        int test2 = Calculator.subtract(-4,-3);
        int test3 = Calculator.subtract(4,0);
        int test4 = Calculator.subtract(-4,0);
        assertEquals(-2, test1);
        assertEquals(-1, test2);
        assertEquals(4, test3);
        assertEquals(-4, test4);
    }

}