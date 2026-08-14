package com.github.maronlab.task_app.data;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;

public class TaskDto {
    @NotBlank(message = "タスク名は必須です")
    private String taskName;
    private LocalDate period;
    private String priority;
    private String status;

    public String getTaskName() {
        return this.taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public LocalDate getPeriod() {
        return period;
    }

    public void setPeriod(LocalDate period) {
        this.period = period;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
