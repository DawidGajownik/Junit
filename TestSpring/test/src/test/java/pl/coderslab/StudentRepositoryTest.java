package pl.coderslab;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@DataJpaTest
public class StudentRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;
    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void find_by_first_name_then_return_student() {
        // given
        Student student = new Student();
        student.setFirstName("John");
        entityManager.persist(student);
        // when
        Student result = studentRepository.findOneByFirstName("John");
        // then
        assertEquals(student.getFirstName(), result.getFirstName());
    }

    @Test
    public void given_mark_then_john_should_be_null() {
        // given
        Student student = new Student();
        student.setFirstName("Mark");
        entityManager.persist(student);
        // when
        Student result = studentRepository.findOneByFirstName("John");
        // then
        assertNull(result);
    }
    @Test
    public void given_jo_and_john_then_find_jo_should_return_two_elements() {
        // given
        Student jo = entityManager.persistAndFlush(new Student("jo"));
        Student john = entityManager.persistAndFlush(new Student("john"));
        // when
        List<Student> result = studentRepository.findBySome("jo");
        // then
        assertThat(result).containsExactly(jo, john);
    }
    @Test
    public void given_jo_and_jean_then_find_jo_should_return_two_elements() {
        // given
        Student jo = entityManager.persistAndFlush(new Student("jo"));
        Student jean = entityManager.persistAndFlush(new Student("jean"));
        // when
        List<Student> result = studentRepository.findBySome("ja");
        // then
        assertThat(result.equals(new ArrayList<>())).isTrue();
    }
}
