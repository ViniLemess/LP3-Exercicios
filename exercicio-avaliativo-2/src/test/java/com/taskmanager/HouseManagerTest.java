package com.taskmanager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseManagerTest {
    private Task task;
    private HouseMember member;
    @BeforeEach
    void init() {
        task = new Task("Wash dishes");
        member = new HouseMember("Andrey", 13, 0);
    }
    @Test
    void mustInstantiateHouseManagerWithSucces() {
        HouseManager houseManager = new HouseManager("Vinicius", 18, 6);

        assertEquals("Vinicius", houseManager.getName());
        assertEquals(18, houseManager.getAge());
        assertEquals(6, houseManager.getDailyWorkHours());
    }
    @Test
    void mustAddTask() {
        HouseManager houseManager = new HouseManager("Vinicius", 18, 6);
        houseManager.addTask(task);

        assertEquals(1, houseManager.getTasksList().size());
    }
    @Test
    void mustAddMember() {
        HouseManager houseManager = new HouseManager("Vinicius", 18, 6);
        houseManager.addHouseMember(member);

        assertEquals(1, houseManager.getHouseMembers().size());
    }
}