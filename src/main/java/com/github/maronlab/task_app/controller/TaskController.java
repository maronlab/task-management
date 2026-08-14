package com.github.maronlab.task_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.github.maronlab.task_app.data.TaskDto;

import jakarta.validation.Valid;

@Controller
public class TaskController {

    @GetMapping("/task")
    //HTML側でth:object="${task}"を書いている＝オブジェクトを作らないと
    //Thymeleafが見つけられない
    private String display(Model model) {
        model.addAttribute("task", new TaskDto());
        return "index";
    }

    @PostMapping("/task")
    public String showTask(
            //ModelAttributeの引数は明示的に合わせている
            //エラーになった際に扱えるようにするため
            @Valid @ModelAttribute("task") TaskDto dto,
            //BindingResultはModelAttribute直後のクラスを認識してくれる
            BindingResult result,
            Model model) {
        if (result.hasErrors()) {
            return "index";
        }
        model.addAttribute("task", dto);
        return "task-result";
    }
}
