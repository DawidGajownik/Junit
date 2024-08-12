package pl.coderslab.tydzien2.z2parametryzowanieTestówEnum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.*;

class AgeClassifierTest {

    @ParameterizedTest
    @EnumSource(AgeGroup.class)
    void testAgeClassification(AgeGroup group) {
        int age = (group.getMinAge() + group.getMaxAge()) / 2; // Przykładowe środkowe wartości dla każdej grupy
        AgeGroup expectedGroup = AgeClassifier.classify(age);
        assertEquals(group, expectedGroup, "Age classification failed for age: " + age);
    }
}