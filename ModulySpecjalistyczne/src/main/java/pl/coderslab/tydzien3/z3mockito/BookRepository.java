package pl.coderslab.tydzien3.z3mockito;

import pl.coderslab.tydzien1.z3asercje.Book;

public interface BookRepository {
    Book findBookByTitle(String title);
}