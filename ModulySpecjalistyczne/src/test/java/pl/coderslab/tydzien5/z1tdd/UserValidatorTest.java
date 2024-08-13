package pl.coderslab.tydzien5.z1tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTest {

    private UserValidator userValidator;

    @BeforeEach
    public void setUp() {
        userValidator = new UserValidator();
    }

    @Test
    public void should_return_false_when_name_is_too_short() {
        User user = new User("Jo", "john@example.com", "password123");
        assertFalse(userValidator.isValid(user));
    }

    @Test
    public void should_return_false_when_email_is_invalid() {
        User user = new User("John", "john@example", "password123");
        assertFalse(userValidator.isValid(user));
    }

    @Test
    public void should_return_false_when_password_is_too_short() {
        User user = new User("John", "john@example.com", "pass");
        assertFalse(userValidator.isValid(user));
    }

    @Test
    public void should_return_true_when_user_data_is_valid() {
        User user = new User("John", "john@example.com", "password123");
        assertTrue(userValidator.isValid(user));
    }
}
