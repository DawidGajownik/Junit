package pl.coderslab.tydzień1.z5cyklŻycia;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class TaskManagerTest {

    private static TaskManager taskManager;
    private static Task task;
    private static Task task2;

    @BeforeAll
    static void beforeEach() {
        taskManager = new TaskManager();
        task = new Task(2, "tytuł", "opis", null);
        task2 = new Task(4, "tytuł", "opis", null);
        taskManager.setTasks(new ArrayList<>(List.of(task, task2)));
    }

    @Test
    void addTask() {
        Task task = new Task(3, "tytuł4", "opis4", null);
        taskManager.addTask(task);
        assertTrue(taskManager.getTasks().contains(task));
    }

    @Test
    void removeTaskById() {
        assertTrue(taskManager.getTasks().contains(task));
        taskManager.removeTaskById(2);
        assertFalse(taskManager.getTasks().contains(task));
    }

    @Test
    void changeTaskStatus() {
        int id = 4;
        String newStatus = "git";
        assertNotEquals(Objects.requireNonNull(taskManager.getTasks().stream().filter(s -> s.getId() == id).findFirst().orElse(null)).getStatus(), newStatus);
        taskManager.changeTaskStatus(id, "git");
        assertEquals(Objects.requireNonNull(taskManager.getTasks().stream().filter(s -> s.getId() == id).findFirst().orElse(null)).getStatus(), newStatus);
    }
}