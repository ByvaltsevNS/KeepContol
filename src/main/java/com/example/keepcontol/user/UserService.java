package com.example.keepcontol.user;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public List<User> getUsers() {
        return List.of(
                new User(
                        1L,
                        "Nikolai",
                        "Byvalstev",
                        "byvaltsev@email.com"
                ),
                new User(
                        2L,
                        "Vasiliy",
                        "Pupkin",
                        "pupkinv@email.com"
                )
        );
    }
}
