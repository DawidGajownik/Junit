package pl.coderslab.tydzien5.z1tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    UserRepository userRepository;
    User user;

    @BeforeEach
    void prepare (){
        userRepository = new UserRepository();
        user = new User("name", "dawid", "pas");
        userRepository.add(1, user);
    }

    @Test
    void add () {
        assertEquals(userRepository.getUsers().size(), 1);;
        assertEquals(userRepository.getUsers().get(1).getName(), "name");
    }
    @Test
    void update () {
        user.setName("błażej");
        userRepository.update(1, user);
        assertEquals(userRepository.getUsers().get(1).getName(), "błażej");
    }
    @Test
    void delete () {
        userRepository.delete(1);
        assertEquals(userRepository.getUsers().size(), 0);
    }
}