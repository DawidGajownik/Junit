package pl.coderslab.tydzien1.z2piramida;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoseCalculatorTest {

    @Test
    void calculateYoungDose() {
        // Sample patient data
        double adultDose = 200; // Maximum dose for adults in milligrams
        double childAge = 6; // Child's age in years

// Calculating the corrected dose for the child
        double correctedDose = DoseCalculator.calculateYoungDose(adultDose, childAge);
        assertEquals(2600, correctedDose);
    }

    @Test
    void clarc() {
        double adultDose = 200;
        double childWeight = 60;

        double correctedDose = DoseCalculator.clarc(adultDose, childWeight);
        assertEquals(176.47058823529412, correctedDose);
    }

    @Test
    void fried() {
        double adultDose = 200;
        double childAge = 60;

        double correctedDose = DoseCalculator.fried(adultDose, childAge);
        assertEquals(80, correctedDose);
    }
}