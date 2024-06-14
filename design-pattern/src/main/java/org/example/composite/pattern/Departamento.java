package org.example.composite.pattern;

import java.util.ArrayList;
import java.util.List;

public class Departamento implements Empresa{

    private String nome;

    private List<Empresa> subDepartamentos = new ArrayList<>();

    public Departamento(String nome) {
        this.nome = nome;
    }

    public void add(Empresa empresa){
        subDepartamentos.add(empresa);
    }

    public void remove(Empresa empresa){
        subDepartamentos.remove(empresa);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Departamento: " + nome);
        for (Empresa empresa : subDepartamentos) {
            empresa.mostrarDetalhes();
        }

    }
}
