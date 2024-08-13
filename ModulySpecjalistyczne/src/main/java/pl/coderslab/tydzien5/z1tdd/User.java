package pl.coderslab.tydzien5.z1tdd;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter

public class User {
    private String name;
    private String email;
    private String password;
}
