package org.example.composite.pattern;



public class Main {

    public static void main(String[] args) {

        Funcionarios funcionario1 = new Funcionarios("João", "Gerente");
        Funcionarios funcionario2 = new Funcionarios("Maria", "Secretaria");
        Funcionarios funcionario3 = new Funcionarios("Pedro", "Vendedor");

        Departamento vendas = new Departamento("Vendas");
        Departamento financeiro = new Departamento("Financeiro");

        vendas.add(funcionario3);
        financeiro.add(funcionario1);
        vendas.add(funcionario2);

        Departamento empresa = new Departamento("Empresa");
        empresa.add(vendas);
        empresa.add(financeiro);

        empresa.mostrarDetalhes();

    }
}
