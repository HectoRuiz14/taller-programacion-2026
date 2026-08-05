package com.umb.taller.domain;

@FunctionalInterface
public interface PlayerValidator {
    boolean validate(Player player);
}