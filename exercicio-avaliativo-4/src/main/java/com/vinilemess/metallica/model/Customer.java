package com.vinilemess.metallica.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private LocalDate birthDate;
    private Boolean student;

    public Customer(String name, LocalDate birthDate, Boolean student) {
        this.name = name;
        this.birthDate = birthDate;
        this.student = student;
        isValid();
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
        long age = ChronoUnit.YEARS.between(birthDate, LocalDate.now());
        return age >= 60;
    }

    private boolean isValid() {
        List<String> messages = new ArrayList<>();
        if (this.name == null || this.name.isBlank()) {
            messages.add("Invalid name!");
        }
        if (this.birthDate == null) {
            messages.add("Invalid birth date!");
        }
        if (this.student == null) {
            messages.add("Invalid student!");
        }
        if (messages.isEmpty()) {
            return true;
        }
        throw new IllegalArgumentException(messages.toString());
    }
}
