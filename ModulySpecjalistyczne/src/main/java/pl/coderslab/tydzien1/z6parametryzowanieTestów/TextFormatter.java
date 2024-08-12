package pl.coderslab.tydzien1.z6parametryzowanieTestów;

public class TextFormatter {
    public static String format(String text) {
        String trim = text.trim();
        return trim.replaceAll("[\\s]+", " ");
    }
}