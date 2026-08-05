package com.umb.taller.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Collections;

public class Team {
    private final String teamName;
    private final List<Player> roster;

    public Team(String teamName) {
        this.teamName = Objects.requireNonNull(teamName, "teamName must not be null");
        this.roster = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        this.roster.add(Objects.requireNonNull(player, "player must not be null"));
    }

    public String getTeamName() {
        return teamName;
    }

    public List<Player> getRoster() {
        return Collections.unmodifiableList(roster);
    }
}