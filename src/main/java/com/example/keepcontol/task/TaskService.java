package com.example.keepcontol.task;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TaskService {

    public List<Task> getTasks() {
        return List.of(
                new Task(1L,
                        "Doing homework",
                        LocalDate.of(2022, 6, 6),
                        "study",
                        1L
                ),
                new Task(
                        2L,
                        "Buy a bike",
                        LocalDate.of(2022, 6, 7),
                        "life",
                        2L
                )
        );
    }
}
