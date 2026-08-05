package com.umb.taller.application;

import com.umb.taller.domain.Player;
import com.umb.taller.domain.PlayerValidator;

public class PlayerValidationService {
    
    // 1. Primera Lambda (Corta)
    public PlayerValidator validateName = p -> p.getName() != null && !p.getName().isEmpty();

    // 2. Segunda Lambda (Con tipo de dato explícito)
    public PlayerValidator validateJersey = (Player p) -> p.getJerseyNumber() > 0;

    // 3. Tercera Lambda (Con bloque de código)
    public PlayerValidator validatePosition = player -> {
        return player.getPosition() != null && !player.getPosition().isEmpty();
    };

    // 4. Method Reference (Referencia a un método estático)
    public static boolean checkId(Player p) {
        return p.getIdNumber() != null && p.getIdNumber().length() > 5;
    }
    public PlayerValidator validateId = PlayerValidationService::checkId;
}