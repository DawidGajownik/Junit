package pl.coderslab.tydzien5.z1tdd;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data

public class UserRepository {

    private Map<Integer, User> users;

    public UserRepository() {
        this.users = new HashMap<>();
    }
    public void add(Integer integer, User user) {
        users.put(integer,user);
    }
    public void update(Integer integer, User user) {
        users.replace(integer, user);
    }
    public void delete(Integer integer) {
        users.remove(integer);
    }
}