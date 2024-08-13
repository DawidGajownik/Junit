package pl.coderslab.tydzien5.z1tdd;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordUtils {
    public boolean validatePasswordStrength (String password) {
        return Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{6,}$", password);
    }
}
