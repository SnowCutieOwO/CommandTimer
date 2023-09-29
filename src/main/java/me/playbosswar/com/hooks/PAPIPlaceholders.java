package me.playbosswar.com.hooks;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import me.playbosswar.com.CommandTimerPlugin;
import me.playbosswar.com.utils.Tools;
import me.playbosswar.com.tasks.Task;
import me.playbosswar.com.utils.Messages;
import me.playbosswar.com.utils.TaskTimeUtils;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.Duration;
import org.joda.time.Interval;

import java.util.Date;
import java.util.Objects;

public class PAPIPlaceholders extends PlaceholderExpansion {
    private final Plugin plugin;

    public PAPIPlaceholders(Plugin p) {
        plugin = p;
    }

    @Override
    public boolean persist() {
        return true;
    }

    @Override
    public boolean canRegister() {
        return true;
    }

    @Override
    public @NotNull String getAuthor() {
        return plugin.getDescription().getAuthors().toString();
    }

    @Override
    public @NotNull String getIdentifier() {
        return "commandtimer";
    }

    @Override
    public @NotNull String getVersion() {
        return plugin.getDescription().getVersion();
    }

    @Override
    public String onPlaceholderRequest(Player player, String identifier) {
        String[] identifierParts = identifier.split("_");

        // %commandtimer_nextExecution%
        // %commandtimer_nextExecutionFormat_No next execution%

//        if(identifierParts.length < 2) {
//            Messages.sendConsole("Used a CommandTimer placeholder wrong. Example: " +
//                    "%commandtimer_testtask_nextExecutionFormat%");
//            return null;
//        }

        String commandName = identifierParts[0];
        String commandField = null;
        String fallbackMessage = null;

        if(identifierParts.length > 1) {
            commandField = identifierParts[1];
        }

        if(identifierParts.length == 3) {
            fallbackMessage = identifierParts[2];
        }

        Task task = CommandTimerPlugin.getInstance().getTasksManager().getTaskByName(commandName);

        // Separate logic when no task is specified, fetch next task
        if(commandName.equals("nextExecution")) {

        }

        if(task == null) {
            Messages.sendConsole("Tried to use PAPI placeholder for unknown command:" + identifier);
            return null;
        }

        if(commandField.equalsIgnoreCase("seconds")) {
            return getSecondsLabel(task, fallbackMessage, false);
        }

        if(commandField.equalsIgnoreCase("secondsFormat")) {
            return getSecondsLabel(task, fallbackMessage, true);
        }

        if(commandField.equalsIgnoreCase("nextExecution")) {
            return getNextExecutionLabel(task, fallbackMessage, false, null);
        }

        if(commandField.equalsIgnoreCase("nextExecutionFormat")) {
            return getNextExecutionLabel(task, fallbackMessage, true, null);
        }

        return getNextExecutionLabel(task, fallbackMessage, false, commandField);
    }

    private String getSecondsLabel(Task task, String fallbackMessage, boolean shouldFormat) {
        int seconds = task.getInterval().toSeconds();

        if(seconds < 0 && fallbackMessage != null) {
            return fallbackMessage;
        }

        if(shouldFormat) {
            return Tools.getTimeString(seconds);
        }

        return seconds + "";
    }

    private String getNextExecutionLabel(Task task, String fallbackMessage, boolean shouldFormat,
                                         @Nullable String commandField) {
        if(!task.getTimes().isEmpty()) {
            Date date = TaskTimeUtils.getSoonestTaskTime(task.getTimes());

            if(date == null || !task.isActive()) {
                return fallbackMessage != null ? fallbackMessage : "";
            }

            long seconds = (date.getTime() - new Date().getTime()) / 1000;

            if(shouldFormat) {
                return Tools.getTimeString((int) seconds);
            }

            return seconds + "";
        }

        Interval interval = new Interval(task.getLastExecuted().getTime(), new Date().getTime());
        Duration period = interval.toDuration();
        long timeLeft = task.getInterval().toSeconds() - period.getStandardSeconds();

        if((timeLeft < 0 || !task.isActive()) && fallbackMessage != null) {
            return fallbackMessage;
        }

        if(commandField != null) {
            return Tools.getTimeString((int) timeLeft, commandField);
        }

        if(shouldFormat) {
            return Tools.getTimeString((int) timeLeft);
        }

        return timeLeft + "";
    }
}