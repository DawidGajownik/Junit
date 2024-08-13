package pl.coderslab.tydzien5.z1tdd;

import java.util.regex.Pattern;

public class UserValidator {
    public boolean isValid(User user){
        return user.getName()!=null
                && user.getEmail()!=null
                && user.getPassword()!=null
                && user.getName().length()>2
                && Pattern.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", user.getEmail())
                && user.getPassword().length()>7;
    }
}
