package pl.coderslab.tydzien3.z3mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pl.coderslab.tydzien1.z3asercje.Book;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class BookServiceTest {

    @Mock
    BookService bookService;

    @Test
    void findBookByTitle() {
        Book book = new Book("ksionżka", "człowiek", "1994", true);
        //BookService bookService = mock(BookService.class);
        when(bookService.findBookByTitle("ksionżka")).thenReturn(book);
        assertThat(bookService.findBookByTitle("ksionżka").equals(book)).isTrue();
    }
}