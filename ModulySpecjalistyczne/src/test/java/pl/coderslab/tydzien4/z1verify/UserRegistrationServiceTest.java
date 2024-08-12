package pl.coderslab.tydzien4.z1verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserRegistrationServiceTest {

    @Mock
    EmailService emailService;

    @Test
    void registerUser() {
        UserRegistrationService userRegistrationService = new UserRegistrationService(emailService);
        userRegistrationService.registerUser("dawidgajownik6@gmail.com");
        verify(emailService).sendConfirmationEmail("dawidgajownik6@gmail.com");
    }
}