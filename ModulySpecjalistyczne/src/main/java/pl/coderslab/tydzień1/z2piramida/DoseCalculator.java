
package pl.coderslab.tydzień1.z2piramida;

public class DoseCalculator {

    // Method for calculating the corrected dose of medicine based on the corrected formula
    static public double calculateYoungDose(double adultDose, double childAgeInYears) {
        // Calculating the corrected dose for the child
        double correctedDose = adultDose * (childAgeInYears / childAgeInYears + 12);

        return correctedDose;
    }

    static public double clarc (double adultDose, double childWeight) {
        return adultDose*(childWeight/68);
    }

    static public double fried (double adultDose, double childAgeInMonths) {
        return childAgeInMonths*(adultDose/150);
    }
}
