package pl.coderslab.tydzień2.z2parametryzowanieTestówEnum;

public class Calculator {
    public static boolean greatNumber (int number) {
        for (int i = 2; i < number; i++) {
            if (number%i==0) {
                return false;
            }
        }
        return number >= 2;
    }
}
