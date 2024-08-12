package pl.coderslab.tydzien3.z3mockito;

import pl.coderslab.tydzien1.z3asercje.Book;

public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book findBookByTitle(String title) {
        return bookRepository.findBookByTitle(title);
    }
}