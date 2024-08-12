package pl.coderslab.tydzien2.z5assertJ;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Data

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();
    private int currentId = 1;

    public List<Task> searchTasks(LocalDate creationDate) {
        return tasks.stream()
                .filter(task -> task.getCreatedAt().toLocalDate().equals(creationDate))
                .collect(Collectors.toList());
    }


    public void addTask(Task task) {
        if (task.getTitle() == null || task.getTitle().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        task.setId(currentId);
        tasks.add(task);
        currentId++;
    }

    public void createTask (String title, String description, TaskStatus status) {
        addTask(new Task(title, description, status));
    }

    public Optional<Task> getById (int id) {
        return tasks.stream().filter(s->s.getId()==id).findFirst();
    }

    public Optional<Task> getByTitle (String title) {
        return tasks.stream().filter(s->s.getTitle().equals(title)).findFirst();
    }

    public Optional<Task> getByDescription (String description) {
        return tasks.stream().filter(s->s.getDescription().equals(description)).findFirst();
    }

    public Optional<Task> getByDateTime (LocalDateTime time) {
        return tasks.stream().filter(s->s.getCreatedAt().isEqual(time)).findFirst();
    }

    public List<Task> getByStatus (TaskStatus status) {
        return tasks.stream().filter(s->s.getStatus().equals(status)).toList();
    }

    public void updateTask (Task task) {
        getById(task.getId()).ifPresent(s -> {
            s.setStatus(task.getStatus());
            s.setDescription(task.getDescription());
            s.setTitle(task.getTitle());
        });
    }

    public void delete (int id) {
        tasks.removeIf(s->s.getId()==id);
    }
}

