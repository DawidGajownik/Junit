package pl.coderslab.tydzien4.z6refaktoryzacja;

import java.util.ArrayList;

public class TaskManager {
    ArrayList<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        if (tasks.contains(task)) {
            System.out.println("Task already exists.");
        } else {
            tasks.add(task);
            System.out.println("Task added successfully.");
        }
    }
}
