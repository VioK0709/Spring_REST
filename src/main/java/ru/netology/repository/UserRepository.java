package ru.netology.repository;

import ru.netology.model.Authorities;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {

    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> users = new ArrayList<>();
        if (user.equals("admin") && password.equals("11")) {
            Collections.addAll(users, Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        } else if (user.equals("dir") && password.equals("00")) {
            Collections.addAll(users, Authorities.READ, Authorities.WRITE);
        } else if (user.equals("user") && password.equals("10")) {
            Collections.addAll(users, Authorities.READ);
        }
        return users;
    }
}
