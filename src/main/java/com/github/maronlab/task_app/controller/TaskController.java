package com.github.maronlab.task_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.github.maronlab.task_app.data.TaskDto;

@Controller
public class TaskController {

    @GetMapping("/task")
    private String display() {
        return "/index.html";
    }

    @PostMapping("/task")
    public String showTask(@ModelAttribute TaskDto dto, Model model) {

        model.addAttribute("task", dto);

        return "/task-result";
    }
}
