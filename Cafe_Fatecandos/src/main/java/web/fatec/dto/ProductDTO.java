package web.fatec.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ProductDTO(
        @NotBlank String title,
        String description,
        @NotBlank String intensity,
        @NotNull BigDecimal price)
{
}
