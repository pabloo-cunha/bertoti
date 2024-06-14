package org.example.composite.pattern;

public class Funcionarios implements Empresa{

    private String nome;
    private String cargo;

    public Funcionarios(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Funcionario: " + nome + " - Cargo: " + cargo);
    }
}
