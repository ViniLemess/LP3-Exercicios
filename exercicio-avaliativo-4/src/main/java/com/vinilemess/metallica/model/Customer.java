package com.vinilemess.metallica.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        long age = ChronoUnit.DAYS.between(LocalDate.now(), birthDate);
        return age >= 60;
    }

    private void isValid() {
        List<String> messages = new ArrayList<>();
        if (this.name == null || this.name.isBlank()) {
            messages.add("Invalid name!");
        }
        if (this.birthDate == null) {
            messages.add("birth date cannot be null!");
        }
        if (this.student == null) {
            messages.add("Student field must be informed!");
        }
        throw new IllegalArgumentException(messages.toString());
    }
}
