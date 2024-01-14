package me.playbosswar.com.hooks;

import me.playbosswar.com.tasks.Task;
import me.playbosswar.com.utils.TaskTimeUtils;
import me.playbosswar.com.utils.TaskUtils;
import org.joda.time.Duration;
import org.joda.time.Interval;

import java.time.LocalDateTime;
import java.util.Date;

public class PlaceholderUtils {
    public static long getNextExecution(Task task) {
        boolean canExecuteToday = TaskUtils.checkTaskDaysContainToday(task);
        // TODO: Interval + not today
        // TODO: Time1 + not today
        // TODO: Time range + not today
        if(!task.getTimes().isEmpty()) {
            Date date = TaskTimeUtils.getSoonestTaskTime(task.getTimes());

            if(date == null || !task.isActive()) {
                return -1;
            }

            return (date.getTime() - new Date().getTime()) / 1000;
        }

        long milliseconds = new Date().getTime();
        if(!canExecuteToday) {
            // TODO: complete different logic
            milliseconds += (TaskUtils.getSecondsTillNextDay(task.getDays(),
                    LocalDateTime.now()) * 1000);

            // Next execution duration =
        }

        System.out.println("Last executed: " + task.getLastExecuted().getTime());
        System.out.println("Now: " + milliseconds);
        Interval interval = new Interval(task.getLastExecuted().getTime(), milliseconds);
        System.out.println("Interval milis: " + interval.toDurationMillis());
        Duration period = interval.toDuration();
        System.out.println("Task time: " + task.getInterval().toSeconds());
        long timeLeft = task.getInterval().toSeconds() - period.getStandardSeconds();

        System.out.println("Time left: " + timeLeft);

        if((timeLeft < 0 || !task.isActive())) {
            return -1;
        }

        return timeLeft;
    }
}
