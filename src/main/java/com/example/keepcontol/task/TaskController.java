package com.example.keepcontol.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping(path="task")
public class TaskController {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskController(TaskRepository taskRepository) {

        this.taskRepository = taskRepository;
    }

    @GetMapping
    public String getTasks(Model model) {

        taskRepository.saveAll(List.of(
                new Task("Doing homework",
                        LocalDate.of(2022, 6, 6),
                        "study",
                        1L
                ),
                new Task("Buy a bike",
                        LocalDate.of(2022, 6, 7),
                        "life",
                        2L
                )
        ));

        model.addAttribute("tasks", taskRepository.findAll());
        return "task";
    }
}
