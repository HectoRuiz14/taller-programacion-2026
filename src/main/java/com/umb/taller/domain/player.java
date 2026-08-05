package com.umb.taller.domain;

import java.util.Objects;

public class Player extends Person {
    private final String position;
    private final int jerseyNumber;

    public Player(String name, String idNumber, String position, int jerseyNumber) {
        super(name, idNumber);
        this.position = Objects.requireNonNull(position, "position must not be null");
        if (jerseyNumber <= 0) {
            throw new IllegalArgumentException("jerseyNumber must be positive");
        }
        this.jerseyNumber = jerseyNumber;
    }

    public String getPosition() {
        return position;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }
}