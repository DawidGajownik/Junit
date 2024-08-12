package pl.coderslab.tydzien3.z2stub;

import pl.coderslab.tydzien3.z1sonarlint.Person;

import java.time.LocalDate;
import java.util.List;

public class PersonRepositoryStubNonAdults implements PersonRepository{
    @Override
    public List<Person> getAllPeople() {
        return List.of(
                new Person("Kacper", "Kowalski", LocalDate.of(2008, 5, 23)),
                new Person("Zuzanna", "Nowak", LocalDate.of(2009, 7, 15)),
                new Person("Jakub", "Wiśniewski", LocalDate.of(2010, 8, 30)),
                new Person("Julia", "Wójcik", LocalDate.of(2007, 2, 14)),
                new Person("Antoni", "Kowalczyk", LocalDate.of(2012, 12, 1)),
                new Person("Maja", "Kamińska", LocalDate.of(2011, 4, 10)),
                new Person("Szymon", "Lewandowski", LocalDate.of(2006, 11, 3)),
                new Person("Amelia", "Zielińska", LocalDate.of(2007, 3, 27)),
                new Person("Filip", "Szymański", LocalDate.of(2009, 9, 18)),
                new Person("Hanna", "Woźniak", LocalDate.of(2010, 6, 21)),
                new Person("Aleksander", "Dąbrowski", LocalDate.of(2008, 1, 8)),
                new Person("Oliwia", "Zając", LocalDate.of(2012, 5, 11)),
                new Person("Michał", "Król", LocalDate.of(2011, 7, 5)),
                new Person("Natalia", "Baran", LocalDate.of(2009, 10, 24)),
                new Person("Nikola", "Sikora", LocalDate.of(2013, 11, 29)),
                new Person("Igor", "Kubiak", LocalDate.of(2010, 4, 2)),
                new Person("Lena", "Michalak", LocalDate.of(2008, 8, 13)),
                new Person("Wiktor", "Wrzesień", LocalDate.of(2012, 2, 22)),
                new Person("Marcel", "Mazurek", LocalDate.of(2007, 12, 19)),
                new Person("Liliana", "Żak", LocalDate.of(2011, 9, 30)),
                new Person("Leon", "Sosnowski", LocalDate.of(2013, 1, 15))
        );
    }
}
