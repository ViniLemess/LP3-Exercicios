package com.taskmanager;

import java.util.ArrayList;
import java.util.List;

public class HouseMember extends People implements Validator<HouseMember>{

    private List<Task> tasksList = new ArrayList<>();

    public HouseMember(String name, int age, int dailyWorkHours) {
        super(name, age, dailyWorkHours);
        isValid(this);
    }
    public List<Task> getTasksList() {
        return tasksList;
    }
    public void pickTask(Task task) {
        if (tasksList.contains(task)) {
            throw new IllegalArgumentException("You have already picked this task!");
        }
    }
    public void isValid(HouseMember houseMember) {
        List<String> exceptionMessages = new ArrayList<>();
        if (houseMember.getDailyWorkHours() < 0) {
            exceptionMessages.add("Daily work hours cannot be negative!");
        }
        if (houseMember.getAge() <= 0) {
            exceptionMessages.add("Age must be bigger than 0!");
        }
        if (houseMember.getName() == null || houseMember.getName().isBlank()) {
            exceptionMessages.add("Name must be informed!");
        }
        if (!exceptionMessages.isEmpty()) {
            throw new IllegalArgumentException(exceptionMessages.toString());
        }
    }
}
