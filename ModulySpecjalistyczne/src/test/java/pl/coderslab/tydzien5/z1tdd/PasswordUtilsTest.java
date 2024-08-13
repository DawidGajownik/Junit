package pl.coderslab.tydzien5.z1tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordUtilsTest {

    @Test
    public void shouldReturnFalseWhenPasswordIsTooShort() {
        PasswordUtils passwordUtils = new PasswordUtils();
        assertFalse(passwordUtils.validatePasswordStrength("short"));
    }

    @Test
    public void shouldReturnFalseWhenPasswordDoesNotContainUppercaseLetter() {
        PasswordUtils passwordUtils = new PasswordUtils();
        assertFalse(passwordUtils.validatePasswordStrength("password1"));
    }

    @Test
    public void shouldReturnFalseWhenPasswordDoesNotContainLowercaseLetter() {
        PasswordUtils passwordUtils = new PasswordUtils();
        assertFalse(passwordUtils.validatePasswordStrength("PASSWORD1"));
    }

    @Test
    public void shouldReturnFalseWhenPasswordDoesNotContainDigit() {
        PasswordUtils passwordUtils = new PasswordUtils();
        assertFalse(passwordUtils.validatePasswordStrength("Password"));
    }

    @Test
    public void shouldReturnFalseWhenPasswordDoesNotContainSpecialCharacter() {
        PasswordUtils passwordUtils = new PasswordUtils();
        assertFalse(passwordUtils.validatePasswordStrength("Password1"));
    }

    @Test
    public void shouldReturnTrueWhenPasswordIsStrong() {
        PasswordUtils passwordUtils = new PasswordUtils();
        assertTrue(passwordUtils.validatePasswordStrength("Password1!"));
    }
}
