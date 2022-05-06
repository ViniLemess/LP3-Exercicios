package com.taskmanager;

import java.time.LocalDateTime;

public class Task implements Validator<Task>{
    private String taskName;
    private TaskStatus taskStatus;
    private LocalDateTime taskDate;
    private LocalDateTime finishDate;

    public Task(String taskName) {
        this.taskName = taskName;
        this.taskStatus = TaskStatus.TO_BE_DONE;
        this.taskDate = LocalDateTime.now().withNano(0);
        isValid(this);
    }
    public TaskStatus showStatus() {
        return taskStatus;
    }
    public String getTaskName() {
        return taskName;
    }
    public LocalDateTime getTaskDate() {
        return taskDate;
    }
    public LocalDateTime getFinishDate() {
        return finishDate;
    }
    public void startTask() {
        if (taskStatus == TaskStatus.DONE) {
            throw new IllegalCallerException("You cannot start a finished task!");
        }
        taskStatus = TaskStatus.ONGOING;
    }
    public void finishTask() {
        if(taskStatus == TaskStatus.TO_BE_DONE) {
            throw new IllegalCallerException("This task must be started!");
        } else if (taskStatus == TaskStatus.DONE) {
            throw new IllegalCallerException("This task has already been finished!");
        }
        taskStatus = TaskStatus.DONE;
        finishDate = LocalDateTime.now().withNano(0);
    }
    public void isValid(Task task) {
        if (task.getTaskName() == null || task.getTaskName().isBlank()) {
            throw new IllegalArgumentException("Name must be informed!");
        }
    }
}
