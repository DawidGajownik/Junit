package pl.coderslab.tydzien1.z5cyklŻycia;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    private Task task;

    @BeforeEach
    void beforeEach() {
        task = new Task(2, "tytuł", "opis", null);
    }

    @AfterEach
    void afterEach() {
        task.setStatus(null);
    }

    @Test
    void changeStatus() {
        String newStatus = "zmieniony";
        task.changeStatus(newStatus);
        assertEquals(newStatus, task.status);
    }

    @Test
    void completeTask() {
        task.completeTask();
        assertEquals("completed", task.status);
    }
}