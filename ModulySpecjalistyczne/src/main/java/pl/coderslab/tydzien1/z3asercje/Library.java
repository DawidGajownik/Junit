package pl.coderslab.tydzien1.z3asercje;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor

public class Library {
    List<Book> books;
    List<Book> searchByTitle(String title) {
        return books.stream().filter(s -> s.title.equals(title)).toList();
    }
    void borrowBook(String title, String author) {
        var bookOpt = books.stream().filter(s -> s.title.equals(title)).filter(s -> s.author.equals(author)).findFirst();
        if (bookOpt.isPresent()){
            if (bookOpt.get().isAvaliable){
                bookOpt.get().setAvaliable(false);
            }
        }
    }
    void returnBook(Book book) {
        book.setAvaliable(true);
    }
}
