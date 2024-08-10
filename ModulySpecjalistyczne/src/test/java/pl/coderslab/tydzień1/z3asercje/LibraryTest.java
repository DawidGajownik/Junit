package pl.coderslab.tydzień1.z3asercje;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    Library library = new Library(List.of(
            new Book("To Kill a Mockingbird", "Harper Lee", "1960", true),
            new Book("1984", "George Orwell", "1949", true),
            new Book("The Great Gatsby", "F. Scott Fitzgerald", "1925", true),
            new Book("The Catcher in the Rye", "J.D. Salinger", "1951", true),
            new Book("The Lord of the Rings", "J.R.R. Tolkien", "1954", true),
            new Book("Pride and Prejudice", "Jane Austen", "1813", true),
            new Book("The Hobbit", "J.R.R. Tolkien", "1937", true),
            new Book("Moby Dick", "Herman Melville", "1851", true),
            new Book("War and Peace", "Leo Tolstoy", "1869", true),
            new Book("Crime and Punishment", "Fyodor Dostoevsky", "1866", true),
            new Book("The Odyssey", "Homer", "8th Century BC", true),
            new Book("The Brothers Karamazov", "Fyodor Dostoevsky", "1880", true),
            new Book("Madame Bovary", "Gustave Flaubert", "1857", true),
            new Book("Jane Eyre", "Charlotte Brontë", "1847", true),
            new Book("Wuthering Heights", "Emily Brontë", "1847", true),
            new Book("Brave New World", "Aldous Huxley", "1932", true),
            new Book("The Iliad", "Homer", "8th Century BC", true),
            new Book("Anna Karenina", "Leo Tolstoy", "1877", true),
            new Book("The Count of Monte Cristo", "Alexandre Dumas", "1844", true),
            new Book("Don Quixote", "Miguel de Cervantes", "1605", true),
            new Book("Ulysses", "James Joyce", "1922", true),
            new Book("The Divine Comedy", "Dante Alighieri", "1320", true),
            new Book("Les Misérables", "Victor Hugo", "1862", true),
            new Book("The Grapes of Wrath", "John Steinbeck", "1939", true),
            new Book("Great Expectations", "Charles Dickens", "1861", true),
            new Book("One Hundred Years of Solitude", "Gabriel Garcia Marquez", "1967", true),
            new Book("Catch-22", "Joseph Heller", "1961", true),
            new Book("Lolita", "Vladimir Nabokov", "1955", true),
            new Book("The Sound and the Fury", "William Faulkner", "1929", true),
            new Book("The Trial", "Franz Kafka", "1925", true),
            new Book("The Metamorphosis", "Franz Kafka", "1915", true),
            new Book("The Stranger", "Albert Camus", "1942", true),
            new Book("Heart of Darkness", "Joseph Conrad", "1899", true),
            new Book("The Sun Also Rises", "Ernest Hemingway", "1926", true),
            new Book("Slaughterhouse-Five", "Kurt Vonnegut", "1969", true),
            new Book("Invisible Man", "Ralph Ellison", "1952", true),
            new Book("Beloved", "Toni Morrison", "1987", true),
            new Book("Fahrenheit 451", "Ray Bradbury", "1953", true),
            new Book("Of Mice and Men", "John Steinbeck", "1937", true),
            new Book("Dracula", "Bram Stoker", "1897", true),
            new Book("The Picture of Dorian Gray", "Oscar Wilde", "1890", true),
            new Book("The Catcher in the Rye", "J.D. Salinger", "1951", true),
            new Book("Animal Farm", "George Orwell", "1945", true),
            new Book("The Adventures of Huckleberry Finn", "Mark Twain", "1884", true),
            new Book("The Secret Garden", "Frances Hodgson Burnett", "1911", true),
            new Book("Frankenstein", "Mary Shelley", "1818", true),
            new Book("Alice's Adventures in Wonderland", "Lewis Carroll", "1865", true),
            new Book("The Old Man and the Sea", "Ernest Hemingway", "1952", true),
            new Book("The Time Machine", "H.G. Wells", "1895", true)
    ));

    @Test
    void searchByTitle() {
        String title = "Animal Farm";
        List <Book> list = library.searchByTitle(title);
        String titleResult = list.getFirst().title;
        assertEquals(title, titleResult);

        String titleFake = "faketitle";
        List <Book> listFake = library.searchByTitle(titleFake);
        String titleResultFake = null;
        if (!listFake.isEmpty()){
            titleResultFake = listFake.getFirst().title;
        }
        assertNotEquals("faketitle", titleResultFake);

        String titleEmpty = "";
        List <Book> listEmpty = library.searchByTitle(titleEmpty);
        String titleResultEmpty = null;
        if (!listEmpty.isEmpty()){
            titleResultEmpty = listFake.getFirst().title;
        }
        assertNull(titleResultEmpty);

        Library library1 = new Library(List.of());
        String titlee = "title";
        List <Book> lastList = library1.searchByTitle(titlee);
        String titleRes = "title";
        assertEquals(List.of(), lastList);
    }

    @Test
    void borrowAvaliableBook () {
        //given

        Book book = library.books.stream().filter(s->s.title.equals("1984") && s.author.equals("George Orwell")).findFirst().orElse(null);

        //when
        library.borrowBook("1984", "George Orwell");

        //then
        assertNotNull(book);
        assertFalse(book.isAvaliable);
    }

    @Test
    void borrowNotAvaliableBook () {
        //given

        Book book = library.books.stream().filter(s->s.title.equals("1984") && s.author.equals("George Orwell")).findFirst().orElse(null);
        //when

        book.setAvaliable(false);
        library.borrowBook("1984", "George Orwell");

        //then
        assertNotNull(book);
        assertFalse(book.isAvaliable);
    }

    @Test
    void returnBook () {
        //given
        Book book = library.books.stream().filter(s->s.title.equals("1984") && s.author.equals("George Orwell")).findFirst().orElse(null);

        //when
        book.setAvaliable(false);
        //then
        assertFalse(book.isAvaliable);
        //when
        library.returnBook(book);
        //then
        assertNotNull(book);
        assertTrue(book.isAvaliable);
    }

    @Test
    void borrowNotExistingBook () {
        //given
        //when

        String toString = library.books.toString();
        library.borrowBook("nie", "istnieje");

        //then
        assertEquals(toString, library.books.toString());
    }
}