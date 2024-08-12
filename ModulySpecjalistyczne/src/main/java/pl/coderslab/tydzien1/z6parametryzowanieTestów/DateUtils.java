package pl.coderslab.tydzien1.z6parametryzowanieTestów;

import java.time.DayOfWeek;

public class DateUtils {
    public static boolean isWeekend(DayOfWeek dayOfWeek) {
        return dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY;
    }
}