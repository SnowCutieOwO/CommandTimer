package me.playbosswar.com.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

class TaskUtilsTest {
    private static long SECONDS_IN_HOUR = 3600;
    private static long SECONDS_IN_DAY = SECONDS_IN_HOUR * 24;

    @Test
    void CanCalculateSecondsTillNextDay() {
        List<DayOfWeek> allowedDays = new ArrayList<>();
        allowedDays.add(DayOfWeek.FRIDAY);
        // Monday
        LocalDateTime referenceDay = LocalDateTime.of(2024, 2, 5, 12, 0, 0);
        long seconds = TaskUtils.getSecondsTillNextDay(allowedDays, referenceDay);

        Assertions.assertEquals((SECONDS_IN_DAY * 4) + (12 * SECONDS_IN_HOUR) - 1, seconds);
    }

    @Test
    void CanCalculateSecondsTillNextDay2() {
        List<DayOfWeek> allowedDays = new ArrayList<>();
        allowedDays.add(DayOfWeek.MONDAY);
        // Tuesday
        LocalDateTime referenceDay = LocalDateTime.of(2024, 2, 6, 12, 0, 0);
        long seconds = TaskUtils.getSecondsTillNextDay(allowedDays, referenceDay);

        Assertions.assertEquals((SECONDS_IN_DAY * 6) + (SECONDS_IN_HOUR * 12) - 1, seconds);
    }
}
