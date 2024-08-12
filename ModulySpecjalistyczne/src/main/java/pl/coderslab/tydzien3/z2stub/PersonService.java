package pl.coderslab.tydzien3.z2stub;

import lombok.AllArgsConstructor;
import pl.coderslab.tydzien3.z1sonarlint.Person;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

@AllArgsConstructor

public class PersonService {
    private PersonRepository personRepository;
    List<Person> getAdults() {
        return personRepository.getAllPeople().stream().filter(s-> Period.between(s.getDateOfBirth(), LocalDate.now()).getYears()>17).toList();
    }
}
