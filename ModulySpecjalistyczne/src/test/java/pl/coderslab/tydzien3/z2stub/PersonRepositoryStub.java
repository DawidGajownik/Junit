package pl.coderslab.tydzien3.z2stub;

import pl.coderslab.tydzien3.z1sonarlint.Person;

import java.time.LocalDate;
import java.util.List;

public class PersonRepositoryStub implements PersonRepository{
    @Override
    public List<Person> getAllPeople() {
        return List.of(
                new Person("Dawid", "Gajownik", LocalDate.of(1994, 1, 10)),
                new Person("Gówniak", "Gówniakowski", LocalDate.of(2010, 12, 12)),
                new Person("Jan", "Kowalski", LocalDate.of(1985, 5, 23)),
                new Person("Anna", "Nowak", LocalDate.of(1992, 3, 17)),
                new Person("Piotr", "Wiśniewski", LocalDate.of(1988, 11, 5)),
                new Person("Katarzyna", "Wójcik", LocalDate.of(1979, 4, 19)),
                new Person("Michał", "Kowalczyk", LocalDate.of(1990, 2, 9)),
                new Person("Małgorzata", "Kamińska", LocalDate.of(2001, 7, 14)),
                new Person("Tomasz", "Lewandowski", LocalDate.of(1993, 9, 20)),
                new Person("Agnieszka", "Dąbrowska", LocalDate.of(1995, 6, 30)),
                new Person("Adam", "Zieliński", LocalDate.of(1980, 10, 25)),
                new Person("Magdalena", "Szymańska", LocalDate.of(1987, 8, 15)),
                new Person("Robert", "Woźniak", LocalDate.of(1999, 12, 1)),
                new Person("Joanna", "Kozłowska", LocalDate.of(1996, 4, 12)),
                new Person("Krzysztof", "Jankowski", LocalDate.of(1991, 1, 22)),
                new Person("Zofia", "Mazur", LocalDate.of(1983, 5, 3)),
                new Person("Andrzej", "Krawczyk", LocalDate.of(1976, 11, 29)),
                new Person("Paulina", "Kaczmarek", LocalDate.of(1997, 3, 25)),
                new Person("Grzegorz", "Piotrowski", LocalDate.of(1989, 7, 18)),
                new Person("Aleksandra", "Grabowska", LocalDate.of(1994, 2, 27)),
                new Person("Jarosław", "Zając", LocalDate.of(1982, 6, 8)),
                new Person("Elżbieta", "Pawlak", LocalDate.of(1978, 10, 16)),
                new Person("Maciej", "Michalski", LocalDate.of(1992, 12, 5)),
                new Person("Dorota", "Kucharska", LocalDate.of(1981, 9, 11)),
                new Person("Bartosz", "Wróbel", LocalDate.of(1990, 11, 2)),
                new Person("Natalia", "Kubiak", LocalDate.of(2000, 8, 24)),
                new Person("Rafał", "Sobczak", LocalDate.of(1984, 4, 13)),
                new Person("Ewa", "Stępień", LocalDate.of(1979, 7, 27)),
                new Person("Mariusz", "Malinowski", LocalDate.of(1998, 5, 9)),
                new Person("Alicja", "Sikora", LocalDate.of(1986, 3, 21)),
                new Person("Sebastian", "Lis", LocalDate.of(1991, 10, 17)),
                new Person("Karolina", "Baran", LocalDate.of(1993, 1, 8)),
                new Person("Paweł", "Michalak", LocalDate.of(1985, 12, 19)),
                new Person("Izabela", "Wrzesień", LocalDate.of(1995, 9, 4)),
                new Person("Łukasz", "Mazurek", LocalDate.of(1987, 2, 28)),
                new Person("Monika", "Żak", LocalDate.of(1982, 6, 23)),
                new Person("Patryk", "Sosnowski", LocalDate.of(1999, 8, 13)),
                new Person("Beata", "Majewska", LocalDate.of(1977, 4, 7)),
                new Person("Jacek", "Król", LocalDate.of(1990, 10, 20)),
                new Person("Sylwia", "Wróblewska", LocalDate.of(2002, 3, 2)),
                new Person("Wojciech", "Czerwiński", LocalDate.of(1997, 12, 29)),
                new Person("Justyna", "Kaleta", LocalDate.of(1988, 7, 19)),
                new Person("Arkadiusz", "Borkowski", LocalDate.of(1983, 11, 13)),
                new Person("Renata", "Nowicka", LocalDate.of(1996, 6, 21)),
                new Person("Wiktor", "Kowal", LocalDate.of(1995, 4, 15)),
                new Person("Izabela", "Olejniczak", LocalDate.of(1991, 5, 6)),
                new Person("Jerzy", "Czajkowski", LocalDate.of(1984, 9, 28)),
                new Person("Martyna", "Błaszczyk", LocalDate.of(2000, 2, 4)),
                new Person("Emilia", "Jastrzębska", LocalDate.of(1982, 12, 31))
        );
    }
}
