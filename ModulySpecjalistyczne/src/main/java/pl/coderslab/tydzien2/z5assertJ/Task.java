package pl.coderslab.tydzien2.z5assertJ;

import lombok.Data;

import java.time.LocalDateTime;

@Data

public class Task {

    public Task(String title, String description, TaskStatus status) {
        this.title = title;
        this.description = description;
        this.status = status;
        this.createdAt = LocalDateTime.now();
    }

    int id;
    String title;
    String description;
    TaskStatus status;
    LocalDateTime createdAt;

    void changeStatus(TaskStatus newStatus) {
        this.status = newStatus;
    }

    void completeTask(){
        this.status = TaskStatus.COMPLETED;
    }
}
