package pl.coderslab.tydzień1.z4warunkiBrzegowe;

import java.util.Arrays;

public class ArrayAverageCalculator {
    double calculateAverage(int[] array) {
        if (array.length==0) {
            return 0;
        }
        return Arrays.stream(array).asDoubleStream().sum()/ Arrays.stream(array).count();
    }
}
