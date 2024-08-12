package pl.coderslab.tydzien2.z3testowanieWyjątków;

public class NegativeNumberException extends RuntimeException {
    public NegativeNumberException() {
        super("Negative is not allowed");
    }

    public NegativeNumberException(String message) {
        super(message);
    }

}