package com.umb.taller.domain;

import java.util.Objects;

public class Match {
    private final Team homeTeam;
    private final Team awayTeam;
    private int homeScore;
    private int awayScore;

    public Match(Team homeTeam, Team awayTeam) {
        this.homeTeam = Objects.requireNonNull(homeTeam, "homeTeam must not be null");
        this.awayTeam = Objects.requireNonNull(awayTeam, "awayTeam must not be null");
        this.homeScore = 0;
        this.awayScore = 0;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public int getAwayScore() {
        return awayScore;
    }

    public void registerGoal(boolean isHomeTeam) {
        if (isHomeTeam) {
            homeScore++;
        } else {
            awayScore++;
        }
    }

    public void registerGoal(Team team) {
        Objects.requireNonNull(team, "team must not be null");
        if (team == homeTeam) {
            homeScore++;
        } else if (team == awayTeam) {
            awayScore++;
        } else {
            throw new IllegalArgumentException("Team is not part of this match");
        }
    }
}