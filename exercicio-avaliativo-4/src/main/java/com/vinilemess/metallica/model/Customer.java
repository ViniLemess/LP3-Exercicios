package com.vinilemess.metallica.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Customer {

    private String name;
    private LocalDate birthDate;
    private boolean student;

    public Customer(String name, LocalDate birthDate, boolean student) {
        this.name = name;
        this.birthDate = birthDate;
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public boolean isStudent() {
        return student;
    }

    public boolean isElderly() {
        long age = ChronoUnit.DAYS.between(LocalDate.now(), birthDate);
        return age >= 60;
    }
}
