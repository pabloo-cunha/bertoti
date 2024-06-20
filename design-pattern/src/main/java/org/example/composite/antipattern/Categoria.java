package org.example.composite.antipattern;

import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Categoria {

        private String nome;
        private List<Produto> produtos = new ArrayList<>();

        Categoria() {
        }

        Categoria (String nome) {
            this.nome = nome;
        }

        public void addProduto(Produto produto) {
            produtos.add(produto);
        }
}
