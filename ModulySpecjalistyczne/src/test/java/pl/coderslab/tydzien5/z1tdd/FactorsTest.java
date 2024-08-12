package pl.coderslab.tydzien5.z1tdd;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class FactorsTest {


    @Test
    void generatePrimeFactors7() {
        assertThat(Factors.generatePrimeFactors(7).equals(List.of(1,7))).isTrue();
    }
    @Test
    void generatePrimeFactors125() {
        assertThat(Factors.generatePrimeFactors(125).equals(List.of(1,5,25,125))).isTrue();
    }
}