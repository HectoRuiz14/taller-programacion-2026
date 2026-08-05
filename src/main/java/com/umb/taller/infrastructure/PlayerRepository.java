package com.umb.taller.application;

import com.umb.taller.domain.Player;
import java.util.HashMap;
import java.util.Map;

public class PlayerRepository {
    private final Map<String, Player> database = new HashMap<>();

    public void save(Player player) {
        database.put(player.getName(), player);
        System.out.println("Player saved to database: " + player.getName());
    }
}