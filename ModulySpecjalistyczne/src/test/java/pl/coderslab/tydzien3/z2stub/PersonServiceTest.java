package pl.coderslab.tydzien3.z2stub;

import org.junit.jupiter.api.Test;
import pl.coderslab.tydzien3.z1sonarlint.Person;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import static org.assertj.core.api.Assertions.*;

class PersonServiceTest {

    @Test
    void getAdults() {
        PersonRepositoryStub personRepositoryStub = new PersonRepositoryStub();
        PersonService personService = new PersonService(personRepositoryStub);
        List<Person> result = personService.getAdults();
        for (int i = 0; i < result.size(); i++) {
            assertThat(Period.between(result.get(i).getDateOfBirth(),LocalDate.now()).getYears()>17).isTrue();
        }
    }

    @Test
    void nonAdults() {
        PersonRepositoryStubNonAdults personRepositoryStubNonAdults = new PersonRepositoryStubNonAdults();
        PersonService personService = new PersonService(personRepositoryStubNonAdults);
        List<Person> result = personService.getAdults();
        for (int i = 0; i < result.size(); i++) {
            assertThat(Period.between(result.get(i).getDateOfBirth(),LocalDate.now()).getYears()>17).isTrue();
        }
        assertThat(result.isEmpty()).isTrue();
    }
}