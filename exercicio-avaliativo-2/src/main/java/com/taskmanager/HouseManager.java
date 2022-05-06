package com.taskmanager;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HouseManager extends People implements Validator<HouseManager>{

    private List<Task> tasksList = new ArrayList<>();
    private List<HouseMember> houseMembers = new ArrayList<>();

    public HouseManager(String name, int age, int dailyWorkHours) {
        super(name, age, dailyWorkHours);
        isValid(this);
    }
    public List<Task> getTasksList() {
        return tasksList;
    }
    public List<HouseMember> getHouseMembers() {
        return houseMembers;
    }
    public void addTask(Task task) {
        if (tasksList.contains(task)) {
            throw new IllegalArgumentException("This task has already been registered");
        }
        tasksList.add(task);
    }
    public void addHouseMember(HouseMember houseMember) {
        if (houseMembers.contains(houseMember)) {
            throw new IllegalArgumentException("This member has already been registered");
        }
        houseMembers.add(houseMember);
    }
    public void giveTask(String taskName, String memberName) {
        Optional<Task> task = tasksList.stream()
                .filter(eTask -> eTask.getTaskName().equals(taskName))
                .findAny();
        Optional<HouseMember> member = houseMembers.stream()
                .filter(eMember -> eMember.getName().equals(memberName))
                .findAny();
        member.get().pickTask(task.get());
    }
    public void isValid(HouseManager houseManager) {
        List<String> exceptionMessages = new ArrayList<>();
        if (houseManager.getDailyWorkHours() < 0) {
            exceptionMessages.add("Daily work hours cannot be negative!");
        }
        if (houseManager.getAge() <= 0) {
            exceptionMessages.add("Age must be bigger than 0!");
        }
        if (houseManager.getName() == null || houseManager.getName().isBlank()) {
            exceptionMessages.add("Name must be informed!");
        }
        if (!exceptionMessages.isEmpty()) {
            throw new IllegalArgumentException(exceptionMessages.toString());
        }
    }
}
