package com.umb.taller.domain;

public class Player extends Person {
    private String position;
    private int jerseyNumber;

    public Player(String name, String idNumber, String position, int jerseyNumber) {
        super(name, idNumber);
        this.position = position;
        this.jerseyNumber = jerseyNumber;
    }

    public String getPosition() {
        return position;
    }
}