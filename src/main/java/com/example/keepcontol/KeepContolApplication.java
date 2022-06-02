package com.example.keepcontol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KeepContolApplication {

    public static void main(String[] args) {
        SpringApplication.run(KeepContolApplication.class, args);
    }

}
