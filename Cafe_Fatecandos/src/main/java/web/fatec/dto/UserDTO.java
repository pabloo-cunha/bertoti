package web.fatec.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDate;

public record UserDTO(
        @NotBlank String name,
        @NotBlank String lastName,
        @NotBlank String cpf,
        @Past LocalDate birthday) {
}
