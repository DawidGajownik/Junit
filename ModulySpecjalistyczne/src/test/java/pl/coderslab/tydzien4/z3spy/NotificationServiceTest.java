package pl.coderslab.tydzien4.z3spy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class NotificationServiceTest {

    @Spy
    NotificationService notificationService;

    @Test
    void notifyUser() {
        notificationService.notifyUser("1","message");
        verify(notificationService).sendEmail("1@example.com", "message");
    }
}