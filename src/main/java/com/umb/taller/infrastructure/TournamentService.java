package com.umb.taller.application;

import com.umb.taller.domain.Player;
import com.umb.taller.infrastructure.EmailNotificationService;

public class TournamentService {
    private final PlayerRepository repository;
    private final EmailNotificationService notificationService;

    public TournamentService(PlayerRepository repository, EmailNotificationService notificationService) {
        this.repository = repository;
        this.notificationService = notificationService;
    }

    public void registerPlayer(Player player, String email) {
        repository.save(player);
        notificationService.sendWelcomeEmail(email);
    }
}