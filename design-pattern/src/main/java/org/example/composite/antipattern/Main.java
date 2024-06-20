package org.example.composite.antipattern;

public class Main {

    public static void main(String[] args) {

        Mercado mercado = new Mercado();

        Produto produto1 = new Produto("Produto 1", 10.0);
        Produto produto2 = new Produto("Produto 2", 20.0);
        Produto produto3 = new Produto("Produto 3", 30.0);
        Produto produto4 = new Produto("Produto 4", 40.0);

        Categoria categoria1 = new Categoria("Categoria 1");
        Categoria categoria2 = new Categoria("Categoria 2");

        categoria1.addProduto(produto1);
        categoria1.addProduto(produto2);
        categoria2.addProduto(produto3);

        mercado.addProduto(produto1);
        mercado.addProduto(produto2);
        mercado.addProduto(produto3);

        mercado.addCategoria(categoria1);
        mercado.addCategoria(categoria2);

        mercado.showProdutosAndCategorias();
    }
}
