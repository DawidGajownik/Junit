package pl.coderslab.tydzien4.z4argumentcaptor;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pl.coderslab.tydzien2.z5assertJ.Task;
import pl.coderslab.tydzien2.z5assertJ.TaskStatus;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class TaskSchedulerTest {

    @Mock
    TaskExecutor taskExecutor;

    @Test
    void scheduleTasks() {
        TaskScheduler taskScheduler = new TaskScheduler(taskExecutor);
        var tasksList = List.of(
                new Task("task","opis", TaskStatus.NOT_STARTED),
                new Task("task1","opis1", TaskStatus.COMPLETED)
        );
        taskScheduler.scheduleTasks(tasksList);

        ArgumentCaptor<Task> captor = ArgumentCaptor.forClass(Task.class);
        verify(taskExecutor, times(2)).executeTask(captor.capture());

        var tasksCaptured = captor.getAllValues();

        assertThat(tasksCaptured.size()==tasksList.size()).isTrue();

        for (int i = 0; i < tasksList.size(); i++) {
            assertThat(tasksCaptured.get(i).getId()==tasksList.get(i).getId()).isTrue();
            assertThat(tasksCaptured.get(i).getTitle().equals(tasksList.get(i).getTitle())).isTrue();
            assertThat(tasksCaptured.get(i).getDescription().equals(tasksList.get(i).getDescription())).isTrue();
            assertThat(tasksCaptured.get(i).getCreatedAt().equals(tasksList.get(i).getCreatedAt())).isTrue();
            assertThat(tasksCaptured.get(i).getStatus().equals(tasksList.get(i).getStatus())).isTrue();
        }
    }
}