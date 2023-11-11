package web.fatec.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;

import java.time.LocalDate;

public record UserDTO(
        @NotBlank String name,
        @NotBlank String lastName,
        @NotBlank String cpf,
        @Past LocalDate birthday) {
}
