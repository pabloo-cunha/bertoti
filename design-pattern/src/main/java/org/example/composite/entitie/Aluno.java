package org.example.composite.entitie;

import java.util.ArrayList;
import java.util.List;

public class Aluno implements Component{

    private String nome;
    private String matricula;

    public Aluno() {
    }

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }
}
