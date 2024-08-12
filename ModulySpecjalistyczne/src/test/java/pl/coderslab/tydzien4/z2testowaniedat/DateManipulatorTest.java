package pl.coderslab.tydzien4.z2testowaniedat;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.*;

class DateManipulatorTest {

    DateManipulator dateManipulator = new DateManipulator();
    String string = "2020-12-13";
    LocalDate localDate = LocalDate.parse(string);

    @Test
    void parseStringToDate() {
        assertThat(dateManipulator.parseStringToDate(string).equals(localDate)).isTrue();
    }

    @Test
    void formatDateToString() {
        assertThat(dateManipulator.formatDateToString(localDate).equals(string)).isTrue();
    }

    @Test
    void addDaysToDate() {
        assertThat(dateManipulator.addDaysToDate(localDate, 2).equals(localDate.plusDays(2))).isTrue();
    }

    @Test
    void subtractDaysFromDate() {
        assertThat(dateManipulator.subtractDaysFromDate(localDate, 2).equals(localDate.minusDays(2))).isTrue();
    }

    @Test
    void isFutureDate() {
        assertThat(dateManipulator.isFutureDate(LocalDate.now().plusDays(1))).isTrue();
    }

    @Test
    void isPastDate() {
        assertThat(dateManipulator.isPastDate(LocalDate.now().minusDays(1))).isTrue();
    }
}