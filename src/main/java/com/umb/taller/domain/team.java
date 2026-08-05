package com.umb.taller.domain;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String teamName;
    private List<Player> roster;

    public Team(String teamName) {
        this.teamName = teamName;
        this.roster = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        this.roster.add(player);
    }

    public List<Player> getRoster() {
        return roster;
    }
}