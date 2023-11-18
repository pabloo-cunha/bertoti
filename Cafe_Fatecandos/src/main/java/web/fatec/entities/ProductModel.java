package web.fatec.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_product;
    private String title;
    private String description;
    private String intensity;
    private BigDecimal price;

    public ProductModel() {
    }

    public ProductModel(Long id_product, String titulo, String descricao, String intensidade, BigDecimal preco) {
        this.id_product = id_product;
        this.title = titulo;
        this.description = descricao;
        this.intensity = intensidade;
        this.price = preco;
    }
}
