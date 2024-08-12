package pl.coderslab.tydzien4.z6refaktoryzacja;

import java.util.Optional;

public class LoginService {
//    private UserRepository userRepository;
//    private EncryptionService encryptionService;
//
//    public LoginService(UserRepository userRepository, EncryptionService encryptionService) {
//        this.userRepository = userRepository;
//        this.encryptionService = encryptionService;
//    }
//
//    private Optional <User> getUser(String username) {
//        return userRepository.findByUserName(username);
//    }
//
//    private String encrypt(String password) {
//        return encryptionService.encrypt(password);
//    }
//
//    private boolean verifyPassword (String userPassword, String encryptedPassword) {
//        return userPassword.equals(encryptedPassword);
//    }
//
//    public boolean login(String username, String password) {
//        Optional <User> user = getUser(username);
//        if (user.isEmpty()) {
//            return false;
//        }
//        String encryptedPassword = encrypt(password);
//        if (verifyPassword(user.getPassword(), encryptedPassword)) {
//            // Logowanie udane
//            // Dodatkowe operacje, np. rejestrowanie czasu logowania
//            return true;
//        }
//        return false;
//    }
//
}
