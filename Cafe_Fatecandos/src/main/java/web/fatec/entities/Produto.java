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
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titulo;
    private String descricao;
    private String intensidade;
    private BigDecimal preco;

    public Produto() {
    }

    public Produto(Long id, String titulo, String descricao, String intensidade, BigDecimal preco) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.intensidade = intensidade;
        this.preco = preco;
    }
}
