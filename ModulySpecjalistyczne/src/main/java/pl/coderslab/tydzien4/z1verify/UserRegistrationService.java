package pl.coderslab.tydzien4.z1verify;

public class UserRegistrationService {
    private EmailService emailService;

    public UserRegistrationService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void registerUser(String userEmail) {
        // Logika rejestracji (pomijamy szczegóły dla uproszczenia)
        emailService.sendConfirmationEmail(userEmail);
    }
}
