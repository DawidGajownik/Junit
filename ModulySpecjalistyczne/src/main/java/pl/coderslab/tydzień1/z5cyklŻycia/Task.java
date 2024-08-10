package pl.coderslab.tydzień1.z5cyklŻycia;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Task {


    int id;
    String title;
    String description;
    String status;

    void changeStatus(String newStatus) {
        this.status = newStatus;
    }

    void completeTask(){
        this.status = "completed";
    }
}
