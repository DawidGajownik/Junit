package pl.coderslab.tydzien1.z3asercje;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class Book {
    String title;
    String author;
    String yearOfPublication;
    boolean isAvaliable;
}
