package pl.coderslab.tydzien4.z2testowaniedat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.Clock;
import java.time.Duration;
import java.time.LocalDate;
import java.time.ZoneId;

import static org.assertj.core.api.Assertions.*;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeekendCalculatorTest {

    @Mock
    Clock clock;

    @InjectMocks
    WeekendCalculator weekendCalculator;

    @BeforeEach
    public void beforeEach() {
        when(clock.getZone()).thenReturn(ZoneId.systemDefault());
    }

    @Test
    public void testDaysUntilWeekendOnMonday() {
        LocalDate day = LocalDate.of(2024, 8, 12);
        when(clock.instant()).thenReturn(day.atStartOfDay(ZoneId.systemDefault()).toInstant());
        when(clock.getZone()).thenReturn(ZoneId.systemDefault());
        long days = weekendCalculator.daysUntilWeekend();
        assertThat(days==5).isTrue();
    }
    @Test
    public void testDaysUntilWeekendOnTuesday() {
        LocalDate day = LocalDate.of(2024, 8, 13);
        when(clock.instant()).thenReturn(day.atStartOfDay(ZoneId.systemDefault()).toInstant());
        when(clock.getZone()).thenReturn(ZoneId.systemDefault());
        long days = weekendCalculator.daysUntilWeekend();
        assertThat(days==4).isTrue();
    }
    @Test
    public void testDaysUntilWeekendOnWednesday() {
        LocalDate day = LocalDate.of(2024, 8, 14);
        when(clock.instant()).thenReturn(day.atStartOfDay(ZoneId.systemDefault()).toInstant());
        when(clock.getZone()).thenReturn(ZoneId.systemDefault());
        long days = weekendCalculator.daysUntilWeekend();
        assertThat(days==3).isTrue();
    }
    @Test
    public void testDaysUntilWeekendOnThursday() {
        LocalDate day = LocalDate.of(2024, 8, 15);
        when(clock.instant()).thenReturn(day.atStartOfDay(ZoneId.systemDefault()).toInstant());
        when(clock.getZone()).thenReturn(ZoneId.systemDefault());
        long days = weekendCalculator.daysUntilWeekend();
        assertThat(days==2).isTrue();
    }
    @Test
    public void testDaysUntilWeekendOnFriday() {
        LocalDate day = LocalDate.of(2024, 8, 16);
        when(clock.instant()).thenReturn(day.atStartOfDay(ZoneId.systemDefault()).toInstant());
        when(clock.getZone()).thenReturn(ZoneId.systemDefault());
        long days = weekendCalculator.daysUntilWeekend();
        assertThat(days==1).isTrue();
    }
    @Test
    public void testDaysUntilWeekendOnSaturday() {
        LocalDate day = LocalDate.of(2024, 8, 17);
        when(clock.instant()).thenReturn(day.atStartOfDay(ZoneId.systemDefault()).toInstant());
        when(clock.getZone()).thenReturn(ZoneId.systemDefault());
        long days = weekendCalculator.daysUntilWeekend();
        assertThat(days==0).isTrue();
    }
    @Test
    public void testDaysUntilWeekendOnSunday() {
        LocalDate day = LocalDate.of(2024, 8, 18);
        when(clock.instant()).thenReturn(day.atStartOfDay(ZoneId.systemDefault()).toInstant());
        when(clock.getZone()).thenReturn(ZoneId.systemDefault());
        long days = weekendCalculator.daysUntilWeekend();
        assertThat(days==0).isTrue();
    }
}