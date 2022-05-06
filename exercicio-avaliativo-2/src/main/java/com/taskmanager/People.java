package com.taskmanager;

public abstract class People{

    protected String name;
    protected int age;
    protected int dailyWorkHours;

    public People(String name, int age, int dailyWorkHours) {
        this.name = name;
        this.age = age;
        this.dailyWorkHours = dailyWorkHours;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getDailyWorkHours() {
        return dailyWorkHours;
    }
}
