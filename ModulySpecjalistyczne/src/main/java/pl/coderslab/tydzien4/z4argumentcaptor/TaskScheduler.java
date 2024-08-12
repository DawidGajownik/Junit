package pl.coderslab.tydzien4.z4argumentcaptor;

import pl.coderslab.tydzien2.z5assertJ.Task;

import java.util.List;

public class TaskScheduler {
    private TaskExecutor taskExecutor;

    public TaskScheduler(TaskExecutor taskExecutor) {
        this.taskExecutor = taskExecutor;
    }

    public void scheduleTasks(List<Task> tasks) {
        for (Task task : tasks) {
            taskExecutor.executeTask(task);
        }
    }
}
