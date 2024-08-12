package pl.coderslab.tydzien2.z5assertJ;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.*;



class TaskManagerTest {

    static TaskManager taskManager;
    static LocalDateTime localDateTime = LocalDateTime.of(2020,12,12,12,12,12);

    @BeforeEach
    void before() {
        taskManager = new TaskManager();
        Task task = new Task("111","222",TaskStatus.NOT_STARTED);
        Task task2 = new Task("111","222",TaskStatus.NOT_STARTED);
        task.setCreatedAt(localDateTime);
        taskManager.addTask(task);
        taskManager.addTask(task2);
    }

    @Test
    void searchTasks () {
        assertThat(taskManager.searchTasks(localDateTime.toLocalDate())).hasSize(1);
        assertThat(taskManager.searchTasks(LocalDate.now())).hasSize(1);
    }

    @Test
    void addTwoTasks () {
        taskManager = new TaskManager();
        taskManager.createTask("title","des", TaskStatus.NOT_STARTED);
        taskManager.createTask("titl1e","de1s", TaskStatus.NOT_STARTED);
        assertThat(taskManager.getTasks()).hasSize(2);
    }

    @Test
    void addTaskExpectException() {
        assertThatThrownBy(() -> {
            Task task = new Task("add", "dodawanie", TaskStatus.NOT_STARTED);
            task.setTitle(null);
            taskManager.addTask(task);
        }).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("cannot be");
        assertThatThrownBy(() -> {
            Task task = new Task("add", "dodawanie", TaskStatus.NOT_STARTED);
            task.setTitle("");
            taskManager.addTask(task);
        }).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("cannot be");
    }

    @Test
    void addTask() {
        Task task = new Task("add", "dodawanie", TaskStatus.NOT_STARTED);
        assertThat(taskManager.getTasks().contains(task)).isFalse();
        taskManager.addTask(task);
        assertThat(taskManager.getTasks().contains(task)).isTrue();
    }

    @Test
    void createTask() {
        assertThat(taskManager.getByDescription("mordo")).isEmpty();
        taskManager.createTask("siema", "mordo",TaskStatus.IN_PROGRESS);
        assertThat(taskManager.getByDescription("mordo")).isNotEmpty();
    }

    @Test
    void getById() {
        assertThat(taskManager.getById(1)).isNotEmpty();
        assertThat(taskManager.getById(2)).isNotEmpty();
        assertThat(taskManager.getById(3)).isEmpty();
        assertThat(taskManager.getById(4)).isEmpty();
    }

    @Test
    void getByTitle() {
        assertThat(taskManager.getByTitle("111")).isNotEmpty();
        assertThat(taskManager.getByTitle("sss")).isEmpty();
    }

    @Test
    void getByDescription() {
        assertThat(taskManager.getByDescription("222")).isNotEmpty();
        assertThat(taskManager.getByDescription("sss")).isEmpty();
    }

    @Test
    void getByDateTime() {
        assertThat(taskManager.getByDateTime(localDateTime)).isNotEmpty();
        assertThat(taskManager.getByDateTime(localDateTime.plusDays(1))).isEmpty();
    }

    @Test
    void getByStatus() {
        assertThat(taskManager.getByStatus(TaskStatus.NOT_STARTED)).isNotEmpty();
        assertThat(taskManager.getByStatus(TaskStatus.COMPLETED)).isEmpty();
    }

    @Test
    void updateTask() {
        assertThat(taskManager.getTasks().getFirst().id==1).isTrue();
        assertThat(taskManager.getTasks().getFirst().id==4).isFalse();
        taskManager.getTasks().getFirst().setId(4);
        assertThat(taskManager.getTasks().getFirst().id==4).isTrue();
        assertThat(taskManager.getTasks().getFirst().id==1).isFalse();
    }

    @Test
    void delete() {
        int id = 2;
        assertThat(taskManager.getTasks().stream().filter(s->s.getId()==id).findFirst()).isNotEmpty();
        taskManager.delete(id);
        assertThat(taskManager.getTasks().stream().filter(s->s.getId()==id).findFirst()).isEmpty();
    }
}