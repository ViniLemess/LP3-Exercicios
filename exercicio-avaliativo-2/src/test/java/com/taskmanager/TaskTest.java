package com.taskmanager;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void mustInstantiateTaskWithSuccess() {
        Task task = new Task("Wash dishes");

       assertEquals("Wash dishes", task.getTaskName());
       assertTrue(task.getTaskDate().isBefore(LocalDateTime.now()));
    }
    @Test
    void mustStartTaskWithSuccess() {
        Task task = new Task("Wash dishes");
        task.startTask();

        assertEquals(TaskStatus.ONGOING, task.showStatus());
    }

    @Test
    void finishTask() {
        Task task = new Task("Wash dishes");
        task.startTask();
        task.finishTask();

        assertEquals(TaskStatus.DONE, task.showStatus());
    }
    @Test
    void validateStartOfFinishedTask() {
        Task task = new Task("Wash dishes");
        task.startTask();
        task.finishTask();
        try {
            task.startTask();
            fail();
        } catch (Exception e) {
            assertEquals("You cannot start a finished task!", e.getMessage());
        }
    }
    @Test
    void validateFinishOfNotStartedTask() {
        Task task = new Task("Wash dishes");
        try {
            task.finishTask();
            fail();
        } catch (Exception e) {
            assertEquals("This task must be started!", e.getMessage());
        }
    }
    @Test
    void validateFinishOfFinishedTask() {
        Task task = new Task("Wash dishes");
        task.startTask();
        task.finishTask();
        try {
            task.finishTask();
            fail();
        } catch (Exception e) {
            assertEquals("This task has already been finished!", e.getMessage());
        }
    }
}