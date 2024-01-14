package me.playbosswar.com.utils;

import me.playbosswar.com.tasks.Task;

import java.time.*;
import java.util.List;

public class TaskUtils {
    public static boolean checkTaskDaysContainToday(Task task) {
        DayOfWeek today = LocalDate.now().getDayOfWeek();

        return task.getDays().contains(today);
    }

    public static long getSecondsTillEndOfDay(LocalDateTime localDate) {
        LocalDateTime endOfDay = LocalDateTime.of(localDate.toLocalDate(), LocalTime.MAX);
        Duration durationUntilEndOfDay = Duration.between(localDate, endOfDay);
        return durationUntilEndOfDay.getSeconds();
    }

    public static long getSecondsTillNextDay(List<DayOfWeek> allowedDays, LocalDateTime referenceDay) {
        long seconds = 0;
        if(allowedDays.contains(referenceDay.getDayOfWeek())) {
            return seconds;
        }

        seconds = getSecondsTillEndOfDay(referenceDay);
        while(!allowedDays.contains(referenceDay.getDayOfWeek())) {
            seconds += 86400;
            referenceDay = referenceDay.plusDays(1);
        }

        System.out.println("Seconds till next day: " + seconds);

        return seconds;
    }
}
