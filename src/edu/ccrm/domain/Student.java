package edu.ccrm.domain;

import java.time.LocalDate;

public class Student {
    private String id;
    private String regNumber;
    private String name;
    private String email;
    private boolean active;
    private LocalDate createdOn;

    public Student(String id, String regNumber, String name, String email) {
        this.id = id;
        this.regNumber = regNumber;
        this.name = name;
        this.email = email;
        this.active = true;
        this.createdOn = LocalDate.now();
    }

    // Getters, setters, toString, update logic
}
