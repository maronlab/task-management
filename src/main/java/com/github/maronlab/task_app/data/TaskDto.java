package com.github.maronlab.task_app.data;

import java.time.LocalDate;
import lombok.Data;
import jakarta.validation.constraints.NotBlank;

@Data
public class TaskDto {
    @NotBlank(message = "タスク名は必須です")
    private String taskName;// タスク名
    private LocalDate period;// 期限
    private String priority;// 優先度
    private String status;// ステータス
}
