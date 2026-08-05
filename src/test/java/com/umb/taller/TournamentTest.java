package com.umb.taller;

import com.umb.taller.domain.Player;
import com.umb.taller.domain.exceptions.EntityNotFoundException;
import com.umb.taller.domain.exceptions.ValidationException;
import com.umb.taller.domain.exceptions.BusinessRuleException;
import com.umb.taller.application.PlayerValidationService;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class TournamentTest {

    // Prueba 1: Valida el comportamiento de la clase POO
    @Test
    void shouldCreatePlayerSuccessfully() {
        Player player = new Player("Lionel Messi", "101010", "Forward", 10);
        assertThat(player.getName()).isEqualTo("Lionel Messi");
        assertThat(player.getPosition()).isEqualTo("Forward");
    }

    // Prueba 2: Valida la excepción EntityNotFound (Nivel 3)
    @Test
    void shouldThrowEntityNotFoundException() {
        Throwable thrown = catchThrowable(() -> {
            throw new EntityNotFoundException("Player", "999");
        });
        assertThat(thrown).isInstanceOf(EntityNotFoundException.class)
                          .hasMessageContaining("Player with ID 999 was not found");
    }

    // Prueba 3: Valida la excepción ValidationException (Nivel 3)
    @Test
    void shouldThrowValidationException() {
        Throwable thrown = catchThrowable(() -> {
            throw new ValidationException("Jersey number must be positive");
        });
        assertThat(thrown).isInstanceOf(ValidationException.class)
                          .hasMessageContaining("Validation failed");
    }

    // Prueba 4: Valida la excepción BusinessRuleException (Nivel 3)
    @Test
    void shouldThrowBusinessRuleException() {
        Throwable thrown = catchThrowable(() -> {
            throw new BusinessRuleException("Team is already full");
        });
        assertThat(thrown).isInstanceOf(BusinessRuleException.class)
                          .hasMessageContaining("Business rule violation");
    }

    // Prueba 5: Valida la interfaz funcional y la Lambda
    @Test
    void shouldValidatePlayerUsingLambdas() {
        Player player = new Player("Cristiano", "777777", "Forward", 7);
        PlayerValidationService service = new PlayerValidationService();
        
        boolean isNameValid = service.validateName.validate(player);
        assertThat(isNameValid).isTrue();
    }
}