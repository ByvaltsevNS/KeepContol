package com.example.keepcontol.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(path="user")
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public String getUsers(Model model) {

        userRepository.saveAll(List.of(
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
        ));

        model.addAttribute("users", userRepository.findAll());

        return "user";
    }

    @PostMapping
    public String addNewUser (@RequestParam String firstName,
                              @RequestParam String lastName,
                              @RequestParam String email) {

        userRepository.save(new User(firstName, lastName, email));
        return "user";
    }
}
