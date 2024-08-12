package pl.coderslab.tydzien1.z6parametryzowanieTestów;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.DayOfWeek;

import static org.junit.jupiter.api.Assertions.*;

class DateUtilsTest {

    @ParameterizedTest
    @ValueSource( strings = {
            "MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY","SUNDAY"
    })
    void isWeekend(String day) {
        assertTrue(DateUtils.isWeekend(DayOfWeek.valueOf(day)));
    }
}