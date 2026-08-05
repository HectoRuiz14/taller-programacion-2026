package com.umb.taller.domain;

public class Match {
    private Team homeTeam;
    private Team awayTeam;
    private int homeScore;
    private int awayScore;

    public Match(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = 0;
        this.awayScore = 0;
    }

    public void registerGoal(boolean isHomeTeam) {
        if (isHomeTeam) {
            homeScore++;
        } else {
            awayScore++;
        }
    }
}