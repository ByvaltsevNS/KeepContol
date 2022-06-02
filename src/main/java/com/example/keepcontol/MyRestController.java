package com.example.keepcontol;

import com.example.keepcontol.Person.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class MyRestController {
    @GetMapping("/rest")
    public List<Person> getPerson() {
        return List.of(
                new Person(
                        1L,
                        "Nikolai Byvalstev",
                        LocalDate.of(1999, 11, 30).toString(),
                        "byvaltsev@email.com"
                ),
                new Person(
                        1L,
                        "Vasiliy Pupkin",
                        LocalDate.of(1980, 10, 20).toString(),
                        "pupkinv@email.com"
                )
        );
    }
}
