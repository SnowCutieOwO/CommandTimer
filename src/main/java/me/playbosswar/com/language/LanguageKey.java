package me.playbosswar.com.language;

import java.util.Arrays;

public enum LanguageKey {
    PREFIX,
    NO_CONSOLE,
    NO_PERMISSION,
    IO_ERROR,
    PLUGIN_LOADED,
    NO_TASK,
    TASK_ACTIVATED,
    TASK_DEACTIVATED,
    TASK_EXECUTION_ONGOING,
    TASK_EXECUTED,
    AND_CONDITION,
    OR_CONDITION,
    SIMPLE_CONDITION,
    NOT_CONDITION,
    GUI_CURRENT,
    CONDITION_TYPE_LORE,
    AVAILABLE_OPTIONS,
    LEFT_CLICK_SWITCH,
    LEFT_CLICK_EDIT,
    LEFT_CLICK_SELECT,
    RIGHT_CLICK_DELETE,
    RIGHT_CLICK_EDIT,
    RIGHT_CLICK_TOGGLE,
    CHANGE_CONDITION,
    CONDITION_GUI_TITLE,
    CONDITION_PARTS_LORE,
    CONDITION_PARTS_TITLE,
    CONDITION_PARTS_GUI_TITLE,
    SIMPLE_CONDITION_LORE,
    SIMPLE_CONDITION_GUI_TITLE,
    CONDITION_GROUP,
    CONDITION_RULE,
    CONDITION,
    CONFIGURE_CONDITION,
    ADD_CONDITION,
    NOT_SET,
    SET_VALUE,
    TEXT_INPUT_DEFAULT,
    TYPE,
    CURRENT_CONFIGURATION,
    AUTHOR,
    VERSION,
    INTEGRATIONS_GUI_TITLE,
    STATUS,
    STATUS_ACTIVE,
    STATUS_NOT_ACTIVE,
    GENDER,
    GENDER_LORE,
    ADD_COMMAND,
    ADD_COMMAND_LORE,
    CURRENT_INTERVAL,
    RIGHT_CLICK_CHANGE_INTERVAL,
    EXECUTION_MODE,
    TASK_COMMANDS_GUI_TITLE,
    EDIT_COMMAND_GUI_TITLE,
    EDIT_COMMAND_DESCRIPTION,
    ENTER_COMMAND_INPUT,
    OPEN_COMMANDS_SETTINGS,
    OPEN_COMMANDS_SETTINGS_LORE,
    COMMAND_SETTINGS_TITLE,
    COMMAND_INTERVAL_LORE,
    COMMAND_DELAY_TITLE,
    COMMAND_DELAY_LORE,
    RESET_COMMAND_INDEX_TITLE,
    RESET_COMMAND_INDEX_LORE,
    GENDER_SELECTOR_LORE,
    GENDER_ITEM,
    CHANGE_COMMAND,
    TASK_EXECUTION_LIMIT_GUI_TITLE,
    TASK_EXECUTION_LIMIT_TITLE,
    TASK_EXECUTION_LIMIT_LORE,
    EXECUTION_LIMIT_NUMBER_GUI_TITLE,
    TOGGLE_RESET_LORE,
    EXECUTION_LIMIT_RESET,
    TASK_LIMIT_GUI_TITLE,
    RIGHT_CLICK_RESET_EXECUTIONS,
    EXECUTION_LIMIT_LORE,
    EXECUTION_LIMIT_TITLE,
    EDIT_DAYS_GUI_TITLE,
    EDIT_HOURS_GUI_TITLE,
    DAYS_LABEL,
    HOURS_LABEL,
    MINUTES_LABEL,
    SECONDS_LABEL,
    TASK_INTERVAL_GUI_TITLE,
    SPECIFIC_TIME_GUI_TITLE,
    TIME_ONE_TITLE,
    TIME_TWO_LORE,
    TIME_TWO_TITLE,
    MINECRAFT_TIME_LORE,
    MINECRAFT_TIME_TITLE,
    MINECRAFT_TIME_WORLD_LORE,
    TASK_TIMES_GUI_TITLE,
    ADD_SPECIFIC_TIME_TITLE,
    ADD_SPECIFIC_TIME_LORE,
    YES_LABEL,
    NO_LABEL,
    TASK_SCHEDULER_GUI_TITLE,
    TASK_INTERVAL_ITEM_TITLE,
    TASK_INTERVAL_HOURS_TITLE,
    TASK_INTERVAL_HOURS_LORE,
    TASK_INTERVAL_DAYS_TITLE,
    TASK_INTERVAL_DAYS_LORE,
    TASK_INTERVAL_ITEM_LORE,
    ALL_TASKS_GUI_TITLE,
    CREATE_TASK_TITLE,
    CREATE_TASK_LORE,
    EDIT_TASK_GUI_TITLE,
    NEW_TASK_INPUT,
    CHANGE_TASK_DISPLAY_NAME_TITLE,
    CHANGE_TASK_DISPLAY_NAME_LORE,
    CHANGE_TASK_SCHEDULE_SETTINGS_TITLE,
    CHANGE_TASK_SCHEDULE_SETTINGS_LORE,
    CHANGE_TASK_COMMANDS_TITLE,
    CHANGE_TASK_COMMANDS_LORE,
    CHANGE_TASK_LIMITS_TITLE,
    CHANGE_TASK_LIMITS_LORE,
    CHANGE_TASK_CONDITIONS_TITLE,
    CHANGE_TASK_CONDITIONS_LORE,
    TASK_ACTIVATION_TITLE,
    TASK_ACTIVATION_LORE,
    EVENTS_GUI_TITLE,
    EVENTS_ITEM_TITLE,
    EVENTS_ITEM_LORE,
    SELECT_EVENTS_GUI_TITLE,
    CONFIGURE_EVENT_GUI_TITLE,
    CONFIGURE_EVENT_VALUES_ITEM_TITLE,
    CONFIGURE_EVENT_VALUES_ITEM_LORE,
    CONFIGURE_EVENT_VALUES_GUI_TITLE,
    SELECT_WORLD_GUI_TITLE,
    BACK_LABEL,
    NEXT_LABEL,
    MAIN_MENU_GUI_TITLE,
    ALL_TASKS_ITEM,
    ALL_TASKS_LORE,
    INTEGRATIONS_ITEM,
    INTEGRATIONS_LORE,
    GENERAL_INFORMATION_ITEM,
    TIME,
    PAPI_INTEGRATION_LABEL,
    PAPI_INTEGRATION_DESCRIPTION,
    METRICS_INTEGRATION_LABEL,
    METRICS_INTEGRATION_DESCRIPTION,
    USED_MINECRAFT_WORLD,
    PLUGIN_RELOADED,
    MINECRAFT_TIME;

    public static LanguageKey getByTag(String tag) {
        return Arrays.stream(values()).filter(value -> value.toString().equals(tag.toUpperCase())).findFirst().orElse(null);
    }
}
