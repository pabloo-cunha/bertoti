package org.example.composite.antipattern;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Produto {

    private String nome;
    private double preco;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}
