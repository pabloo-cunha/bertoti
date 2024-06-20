package org.example.composite.antipattern;

import java.util.ArrayList;
import java.util.List;

public class Mercado {

    private List<Produto> produtos = new ArrayList<>();
    private List<Categoria> categorias = new ArrayList<>();

    Mercado() {
    }

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public void addCategoria(Categoria categoria) {
        categorias.add(categoria);
    }

    public void showProdutosAndCategorias() {
        System.out.println("Itens:");
        for (Categoria categoria : categorias) {
            System.out.println("Categoria: " + categoria.getNome());
            for (Produto produto : categoria.getProdutos()) {
                System.out.println("Produto: " + produto.getNome() + " - R$ " + produto.getPreco());
            }
        }
    }
}
