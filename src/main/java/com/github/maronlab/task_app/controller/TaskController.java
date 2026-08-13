package com.github.maronlab.task_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskController {
    
    @GetMapping("/task")
    private String display(){
        return "/index.html";
    }
}
