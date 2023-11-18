package web.fatec.dto;

import jakarta.validation.constraints.NotBlank;
import web.fatec.entities.ProductModel;
import web.fatec.entities.UserModel;

public record OrderDTO(
        @NotBlank ProductModel id_product,
        @NotBlank UserModel id_user
) {
}
