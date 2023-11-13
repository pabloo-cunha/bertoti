package web.fatec.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

import java.time.LocalDate;
import java.util.Date;

public record UserDTO(
        @NotBlank String name,
        @NotBlank String lastName,
        @NotBlank @NotNull String cpf,
        @NotNull @Past @JsonFormat(pattern = "dd/MM/yyyy") LocalDate birthday
)
{
}
