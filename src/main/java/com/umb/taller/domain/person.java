package com.umb.taller.domain;

import java.util.Objects;

public abstract class Person {
    private String name;
    private String idNumber;

    public Person(String name, String idNumber) {
        this.name = Objects.requireNonNull(name, "name must not be null");
        this.idNumber = Objects.requireNonNull(idNumber, "idNumber must not be null");
    }

    public String getName() {
        return name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setName(String name) {
        this.name = Objects.requireNonNull(name, "name must not be null");
    }
}