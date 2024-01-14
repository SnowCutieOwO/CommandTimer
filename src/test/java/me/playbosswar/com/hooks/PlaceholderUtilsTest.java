package me.playbosswar.com.hooks;

import me.playbosswar.com.tasks.Task;
import me.playbosswar.com.tasks.TaskInterval;
import me.playbosswar.com.tasks.TaskTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

import java.time.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class PlaceholderUtilsTest {
    @Test
    void calculateTimeLeftInTaskWithIntervalTest() {
        Task task = mock(Task.class, withSettings().defaultAnswer(CALLS_REAL_METHODS));
        doNothing().when(task).storeInstance();

        task.setLastExecuted(new Date());
        task.setActive(true);
        task.setInterval(new TaskInterval(task, 0, 0, 1, 0));
        task.setTimes(new ArrayList<>());
        long time = PlaceholderUtils.getNextExecution(task);

        Assertions.assertEquals(60, time);
    }

    @Test
    void calculateTimeLeftInTaskWithHoursSet() {
        Task task = mock(Task.class, withSettings().defaultAnswer(CALLS_REAL_METHODS));
        doNothing().when(task).storeInstance();

        task.setLastExecuted(new Date());
        task.setActive(true);
        task.setInterval(new TaskInterval(task, 0, 0, 0, 0));
        List<DayOfWeek> days = new ArrayList<>();
        days.add(DayOfWeek.MONDAY);
        days.add(DayOfWeek.TUESDAY);
        days.add(DayOfWeek.WEDNESDAY);
        days.add(DayOfWeek.THURSDAY);
        days.add(DayOfWeek.FRIDAY);
        days.add(DayOfWeek.SATURDAY);
        days.add(DayOfWeek.SUNDAY);
        task.setDays(days);

        List<TaskTime> times = new ArrayList<>();
        LocalTime time1 = LocalTime.now().plusHours(1);
        times.add(new TaskTime(task, time1, false));
        task.setTimes(times);
        long time = PlaceholderUtils.getNextExecution(task);

        Assertions.assertEquals(3599, time);
    }

    @Test
    void calculateTimeLeftInTaskWithHourInterval() {
        Task task = mock(Task.class, withSettings().defaultAnswer(CALLS_REAL_METHODS));
        doNothing().when(task).storeInstance();

        task.setLastExecuted(new Date());
        task.setActive(true);
        task.setInterval(new TaskInterval(task, 0, 0, 1, 0));
        List<DayOfWeek> days = new ArrayList<>();
        days.add(DayOfWeek.MONDAY);
        days.add(DayOfWeek.TUESDAY);
        days.add(DayOfWeek.WEDNESDAY);
        days.add(DayOfWeek.THURSDAY);
        days.add(DayOfWeek.FRIDAY);
        days.add(DayOfWeek.SATURDAY);
        days.add(DayOfWeek.SUNDAY);
        task.setDays(days);

        List<TaskTime> times = new ArrayList<>();
        LocalTime time1 = LocalTime.now().plusHours(1);
        LocalTime time2 = LocalTime.now().plusHours(2);
        times.add(new TaskTime(task, time1, time2, false));
        task.setTimes(times);
        long time = PlaceholderUtils.getNextExecution(task);

        // The range starts in 3599 seconds, + the 60 seconds of the interval
        Assertions.assertEquals(3599 + 60, time);
    }

    @Test
    void calculateTimeLeftInTaskWithDaysAndInterval() {
        Task task = mock(Task.class, withSettings().defaultAnswer(CALLS_REAL_METHODS));
        doNothing().when(task).storeInstance();

        task.setLastExecuted(new Date());
        task.setActive(true);
        task.setInterval(new TaskInterval(task, 0, 0, 1, 0));
        List<DayOfWeek> days = new ArrayList<>();
        days.add(DayOfWeek.MONDAY);
        days.add(DayOfWeek.TUESDAY);
        days.add(DayOfWeek.WEDNESDAY);
        days.add(DayOfWeek.THURSDAY);
        days.add(DayOfWeek.FRIDAY);
        days.add(DayOfWeek.SATURDAY);
        days.add(DayOfWeek.SUNDAY);

        LocalDate today = LocalDate.now();
        DayOfWeek currentDay = today.getDayOfWeek();
        days.remove(currentDay);
        task.setDays(days);

        List<TaskTime> times = new ArrayList<>();
        task.setTimes(times);

        LocalDateTime endOfDay = LocalDateTime.of(today, LocalTime.MAX);
        Duration durationUntilEndOfDay = Duration.between(LocalDateTime.now(), endOfDay);
        long secondsUntilEndOfDay = durationUntilEndOfDay.getSeconds();

        long time = PlaceholderUtils.getNextExecution(task);
        Assertions.assertEquals(secondsUntilEndOfDay + 60, time);
    }
}
