package com.example.keepcontol.User;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    public List<User> getUsers() {
        return List.of(
                new User(
                        1l,
                        "Nikolai",
                        "Byvalstev",
                        "byvaltsev@email.com"
                ),
                new User(
                        2l,
                        "Vasiliy",
                        "Pupkin",
                        "pupkinv@email.com"
                )
        );
    }
}
