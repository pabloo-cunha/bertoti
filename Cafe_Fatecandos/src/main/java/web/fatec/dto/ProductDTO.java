package web.fatec.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ProductDTO(
        @NotBlank String titulo,
        String description,
        @NotBlank String intensidade,
        @NotNull BigDecimal price) {
}
