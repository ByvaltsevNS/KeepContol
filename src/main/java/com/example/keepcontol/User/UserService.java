package com.example.keepcontol.User;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class UserService {

    public List<User> getUsers() {
        return List.of(
                new User(
                        1L,
                        "Nikolai Byvalstev",
                        LocalDate.of(1999, 11, 30).toString(),
                        "byvaltsev@email.com"
                ),
                new User(
                        2L,
                        "Vasiliy Pupkin",
                        LocalDate.of(1980, 10, 20).toString(),
                        "pupkinv@email.com"
                )
        );
    }
}
